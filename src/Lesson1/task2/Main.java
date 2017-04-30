package Lesson1.task2;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * Created by DmRG on 23.02.2017.
 */
public class Main {
    public static void main(String[] args) {
        String str = "";
        Class<?> cls = TextContainer.class;
        Field[] field = cls.getDeclaredFields();
        for (Field fields : field) {
            if (fields.isAnnotationPresent(SaveStr.class)) {
                if (!fields.isAccessible()) {
                    fields.setAccessible(true);
                    try {
                        str = (String) fields.get(cls);
                        break;
                    } catch (IllegalAccessException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
        Saver save = new Saver();
        Class<?> cls2 = save.getClass();
        try {

            Method method = cls2.getDeclaredMethod("save", String.class, String.class);
              if (method.isAnnotationPresent(SaveTo.class)) {
                  SaveTo saveTo = method.getAnnotation(SaveTo.class);
                  method.invoke(save, saveTo.path(),str);
              }
        } catch (NoSuchMethodException | IllegalAccessException | InvocationTargetException e) {
            e.printStackTrace();
        }

    }
}
