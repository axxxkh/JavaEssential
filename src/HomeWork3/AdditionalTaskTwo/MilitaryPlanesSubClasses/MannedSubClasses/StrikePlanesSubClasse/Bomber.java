package HomeWork3.AdditionalTaskTwo.MilitaryPlanesSubClasses.MannedSubClasses.StrikePlanesSubClasse;

import HomeWork3.AdditionalTaskTwo.MilitaryPlanesSubClasses.MannedSubClasses.StrikePlanes;

public class Bomber extends StrikePlanes implements BomberActions {
    public String bomberType;
    public int bombsType;
    public int bombsAmount;

    @Override
    public void openBombTank() {
        System.out.println("Opens bobm tanl");
    }

    @Override
    public void dropBombs() {
        System.out.println("Droped the bombs");
    }
}
