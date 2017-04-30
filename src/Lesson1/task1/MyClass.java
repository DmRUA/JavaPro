package Lesson1.task1;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * Created by DmRG on 23.02.2017.
 */
public class MyClass  {

    @Test(a = 5, b = 5)
    public void add(int a, int b) {
        System.out.println("the sum of numbers: " + (a + b));
    }
}
