package HomeWork3.AdditionalTaskTwo.MilitaryPlanesSubClasses.MannedSubClasses;

import HomeWork3.AdditionalTaskTwo.MilitaryPlanesSubClasses.Manned;

public class StrikePlanes extends Manned implements StrikePlanesActions{
    public String strikeArea;

    @Override
    public void prepareToAttack() {
        System.out.println("prepared to attack");
    }

    @Override
    public void findTarget() {
        System.out.println("Target is found");
    }
}
