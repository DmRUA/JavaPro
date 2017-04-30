package Lesson1.task3;

import java.io.*;
import java.lang.reflect.Field;
import java.util.ArrayList;

/**
 * Created by DmRG on 23.02.2017.
 */
public class SerilizableFieldOnlyAnnotation {
    private String path;

    public SerilizableFieldOnlyAnnotation(String path) {
        this.path = path;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public void SaveToFile(Object obj) {
        File file = new File(path);
        StringBuilder sb = new StringBuilder();
        if (file.exists()) {
            Class<?> cls = obj.getClass();
            Field[] fields = cls.getDeclaredFields();
            try (PrintWriter pw = new PrintWriter(file)) {
                for (Field field : fields) {
                    if (field.isAnnotationPresent(Save.class)) {
                        if (!field.isAccessible()) {
                            field.setAccessible(true);
                        }
                        sb.append(field.getName() + "=" + field.getType().getName() + "=" + field.get(obj) + System.lineSeparator());
                    }
                }
                pw.print(sb);
            } catch (IllegalAccessException | FileNotFoundException e) {
                e.printStackTrace();
            }
        } else System.out.println("File not found");
    }

    public <T> T loadToFile(String path, Class<T> cls) {
        T result = null;
        try {
            T res = cls.newInstance();
            File file = new File(path);
            if (file.exists()) {
                BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(file)));
                String str = "";
                for (; (str = reader.readLine()) != null; ) {
                    String[] arr = str.split("=");
                    Field field = cls.getDeclaredField(arr[0]);
                    if (!field.isAccessible()) field.setAccessible(true);
                    if (field.isAnnotationPresent(Save.class)) {
                        if (field.getType().getName().equals(arr[1])) {
                            if (field.getType() == int.class) field.setInt(res, Integer.parseInt(arr[2]));
                            if (field.getType() == String.class) field.set(res, arr[2]);
                            if (field.getType() == double.class) field.setDouble(res, Double.parseDouble(arr[2]));
                        } else System.out.println("Не правильные типы переменных");
                    }
                }
            result = res;
            } else System.out.println("File not found");
        } catch (InstantiationException | IllegalAccessException | IOException | NoSuchFieldException e) {
            e.printStackTrace();
        }
        return result;
    }
}
