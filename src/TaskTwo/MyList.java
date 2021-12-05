package TaskTwo;

import java.util.ArrayList;
import java.util.List;

public class MyList<T> {
    private List<T> myList = new ArrayList<>();
    // як виявилось писати типу T[] = new T[] не можна, якщо правильно зрозумів то це
    // стирання типів
    private int size;

    public void add(T element) {
        myList.add(element);
        size++;
    }

    public T get(int index) {
        if (index < size && index >= 0) {
            return myList.get(index);
        } else {
            System.out.println("Wrong index");
            return null;
        }
    }

    public int getSize() {
        return size;
    }

    public static void main(String[] args) {
        MyList<String> list = new MyList<>();
        list.add("fffff");
        System.out.println(list.get(0));
        System.out.println(list.size);
        System.out.println((list.get(10)));
    }

}

