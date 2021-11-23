package TaskTwo;

import java.util.ArrayList;

public class Zoo {
    public ArrayList<String> animals = new ArrayList<>();

    public void show() {
        System.out.println(animals);
    }

    public Zoo() {
        animals.add(0, "Elephant");
        animals.add(1, "Panda");
        animals.add(2, "Falcon");
        animals.add(3, "Monkey");
        animals.add(4, "Phoenix");
        animals.add(5, "Anakonda");
        animals.add(6, "Cobra");
        animals.add(7, "Dolphin");
    }

    public static void main(String[] args) {
        Zoo zoo = new Zoo();
        zoo.show();
    }
}