package TaskTwo;

import AdditionalTask.Animal;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TaskTwo {
    public static void main(String[] args) {
        List<Integer> myList = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            myList.add((int) (Math.random() * 100));
        }

        Iterator<Integer> iterator = myList.listIterator();

        while (iterator.hasNext()) {
            System.out.print(iterator.next() + ", ");
        }
    }
}
