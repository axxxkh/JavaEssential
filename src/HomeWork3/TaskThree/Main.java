package HomeWork3.TaskThree;

public class Main {

    public static void main(String[] args) {
        Car myCar = new Car();
        Ship myShip = new Ship();
        Plane myPlane = new Plane();
        myShip.setCoordinates("45.372727283 31.37373738");
        myShip.setManufacrureYear(1900);
        myShip.setPrice(10000000);
        myShip.setSpeed(35);
        myShip.setPortSigned("Odessa");
        myShip.setPassangersAmount(1000);

        myPlane.setCoordinates("45.372727283 31.37373738");
        myPlane.setManufacrureYear(1900);
        myPlane.setPrice(10000000);
        myPlane.setSpeed(35);
        myPlane.setNumberOfPassengers(333);
        myPlane.setAltitude(10000);

        myShip.show();
        myPlane.show();
    }
}
