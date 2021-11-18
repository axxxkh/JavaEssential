package HomeWork3.AdditionalTaskTwo.MilitaryPlanesSubClasses.MannedSubClasses.StrikePlanesSubClasse;

import HomeWork3.AdditionalTaskTwo.MilitaryPlanesSubClasses.MannedSubClasses.StrikePlanes;

public class AirSupportAircraft extends StrikePlanes implements ASAActions {
    public String airSupportCraftType;
    public int ammosLeft;

    public void stopGatlingGun() {
        System.out.println("Stops gatling gun");
    }

    public void runGatlingGun() {
        System.out.println("Starts gatling gun");
    }
}
