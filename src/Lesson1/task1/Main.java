package Lesson1.task1;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * Created by DmRG on 23.02.2017.
 */
public class Main {
    public static void main(String[] args) {
        MyClass mycls = new MyClass();
        Class<?> cls = mycls.getClass();
        try {
            Method method = cls.getDeclaredMethod("add", int.class, int.class );
            Test test = method.getAnnotation(Test.class);
            method.invoke(mycls, test.a(), test.b());
        } catch (NoSuchMethodException | IllegalAccessException | InvocationTargetException e) {
            e.printStackTrace();
        }
    }
}

