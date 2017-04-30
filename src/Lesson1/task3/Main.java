package Lesson1.task3;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Arrays;

/**
 * Created by DmRG on 23.02.2017.
 */
public class Main {
    public static void main(String[] args) {
        MyClass myClass = new MyClass("Hello", 5, 4.8, "Bye");
        System.out.println(myClass);
        SerilizableFieldOnlyAnnotation save = new SerilizableFieldOnlyAnnotation("C:\\Ruslan\\test\\test1.txt");
        save.SaveToFile(myClass);
        MyClass myClass1 = save.loadToFile("C:\\Ruslan\\test\\test1.txt", MyClass.class);
        System.out.println(myClass1);
    }
}
