package MyArray;

import java.util.ArrayList;

public class Main {
    public static MyList list = new MyList();

    public static void main(String[] args) {
        list.add("0");
        list.add("1");
        list.add("22");
        list.add("333");

        list.remove(1);
        list.add("33333", 2);
        list.remove("33333");
        list.remove(3);
        list.print();

        System.out.println(list.indexOf("111"));

        list.clear();
        list.print();
    }
}
