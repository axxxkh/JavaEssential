package TaskTwo;

public class Vehicle {

    void print() {
        System.out.println("This is car");
    }

    class Wheel {
        void print() {
            System.out.println("Wheels is good");
        }
    }

    class Doors {
        void print() {
            System.out.println("Door is closed");
        }
    }

    public static void main(String[] args) {

        Vehicle vehicle = new Vehicle();
        Wheel myWheels = new Vehicle().new Wheel();
        // пробував різні варіанти. в принципі працює, ми при оголошенні можемо зразу
        // оголосити клас Wheel, але після new деталізувати
        // з іншого боку якщо Wheеl статичний клас то ми можемо відразу його напряму створити
        // але тоді не пройде нижче написаний варіант відповіді
        Vehicle.Doors myDoors = new Vehicle().new Doors();

        vehicle.print();
        Wheel car = new Vehicle().new Wheel();

        myWheels.print();
        myDoors.print();
    }
}
