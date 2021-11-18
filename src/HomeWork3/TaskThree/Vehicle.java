package HomeWork3.TaskThree;

public class Vehicle {
    public String getCoordinates() {
        return coordinates;
    }

    public void setCoordinates(String coordinates) {
        this.coordinates = coordinates;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getManufacrureYear() {
        return manufacrureYear;
    }

    public void setManufacrureYear(int manufacrureYear) {
        this.manufacrureYear = manufacrureYear;
    }

    protected String coordinates;
    protected int price;
    protected int speed;
    protected int manufacrureYear;

    public void show() {
        System.out.println("information about " + getClass().getSimpleName());
        System.out.println("location is " + coordinates);
        System.out.println("price is " + price);
        System.out.println("speed is " + speed);
        System.out.println("manufacture year is " + manufacrureYear);
    }
}
