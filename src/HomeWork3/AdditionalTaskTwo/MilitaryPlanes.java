package HomeWork3.AdditionalTaskTwo;

public class MilitaryPlanes implements MilitaryPlanesActions {
    public String airbase;
    public int speed;
    public int takeOffWeight;
    public int ceiling;

    @Override
    public void takeFlight() {
        System.out.println("Let's go take a flight");
    }

    @Override
    public void takeFuel() {
        System.out.println("Fuel to the full tank");
    }

    @Override
    public void returnToTheBase() {
        System.out.println("Return to the base");
    }
}
