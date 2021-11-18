package HomeWork3.AdditionalTaskTwo.MilitaryPlanesSubClasses.MannedSubClasses.StrikePlanesSubClasse;

import HomeWork3.AdditionalTaskTwo.MilitaryPlanesSubClasses.MannedSubClasses.StrikePlanes;

public class Fighter extends StrikePlanes implements FighterActions {
    public String fighterType;
    public String rocketsType;
    public int rocketsLeft;

    @Override
    public void launchRocket() {
        System.out.println("Rockets launch");
    }

    @Override
    public void forsfge() {
        System.out.println("Forsage is on. Super sonic speed");
    }
}
