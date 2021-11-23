package TaskThree;

import TaskTwo.Zoo;

public class Main {
    public static void main(String[] args) {
        Zoo zoo = new Zoo();
        // нумерація в списках введеться так само як і в масивах починаючи з нуля
        // 8 елемент списку має індекс 7, список за рахунок реалізації являє собою
        // динамічний масив, тому після кожного видалення його розмір зменшується
        zoo.animals.remove(7);
        zoo.animals.remove(5);
        zoo.animals.remove(3);

        System.out.println(zoo.animals.size());
        zoo.show();
    }
}