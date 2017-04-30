package PrometeusTask1;

/**
 * Created by DmRG on 06.03.2017.
 */
public class Main {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        System.out.println(list.get(4));
        System.out.println(list.get(3));
        System.out.println(list.get(-2));
    }
}
