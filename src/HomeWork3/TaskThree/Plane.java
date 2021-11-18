package HomeWork3.TaskThree;

public class Plane extends Vehicle {
    public int numberOfPassengers;
    public int altitude;

    public int getNumberOfPassengers() {
        return numberOfPassengers;
    }

    public void setNumberOfPassengers(int numberOfPassengers) {
        this.numberOfPassengers = numberOfPassengers;
    }

    public int getAltitude() {
        return altitude;
    }

    public void setAltitude(int altitude) {
        this.altitude = altitude;
    }

    @Override
    public void show() {
        super.show();
        System.out.println("Number of passengers is " + numberOfPassengers);
        System.out.println("Altitude is " + altitude);
    }
}
