package Lesson1.task3;

/**
 * Created by DmRG on 23.02.2017.
 */
public class MyClass {
    @Save private  String str;
    private   int a;
    @Save public  double b;
    public  String str2;

    public MyClass() {
    }

    public MyClass(String str, int a, Double b, String str2) {
        this.str = str;
        this.a = a;
        this.b = b;
        this.str2 = str2;
    }

    @Override
    public String toString() {
        return "MyClass{" +
                "str='" + str + '\'' +
                ", a=" + a +
                ", b=" + b +
                ", str2='" + str2 + '\'' +
                '}';
    }
}
