package HomeWork3.AdditionalTaskTwo.MilitaryPlanesSubClasses;

import HomeWork3.AdditionalTaskTwo.MilitaryPlanes;

public class Manned extends MilitaryPlanes implements MannedPlanesActions {
    public String pilotName;
    public int pilotFlights;

    public void catapult() {
        System.out.println("Let's jump");
    }

    public void coffeeToThePilot() {
        System.out.println("here yours coffe");
    }
}
