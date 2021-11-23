package TaskFour;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            list.add(i, (int) (Math.random() * 100));
        }
        System.out.println(list);

        ListIterator<Integer> iterator = list.listIterator();

        while (iterator.hasNext()) {
            list.set(iterator.nextIndex(), iterator.next() + 1);
        }

        System.out.println(list);
    }
}
