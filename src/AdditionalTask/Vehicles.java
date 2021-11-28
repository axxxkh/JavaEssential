package AdditionalTask;

public enum Vehicles {
    HONDA(1000, "Red"), BMW(2000, "blue"), MAZDA(1500, ""), TOYOTA(1700, "");
    private int price;
    private String colour;

    @Override
    public String toString() {
        return "car is " + name() + ". Price is " + price + ", colour is " + colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    Vehicles(int price, String colour) {
        this.price = price;
        this.colour = colour;
    }
}
