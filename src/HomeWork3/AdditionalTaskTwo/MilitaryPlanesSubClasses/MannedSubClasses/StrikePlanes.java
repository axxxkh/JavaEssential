package HomeWork3.AdditionalTaskTwo.MilitaryPlanesSubClasses.MannedSubClasses;

import HomeWork3.AdditionalTaskTwo.MilitaryPlanesSubClasses.Manned;

public class StrikePlanes extends Manned {
    public String strikeArea;

    public void prepareToAttack() {
        System.out.println("prepared to attack");
    }

    public void findTarget() {

        System.out.println("Target is found");
    }
}
