package HomeWork3.AdditionalTaskTwo.MilitaryPlanesSubClasses.MannedSubClasses.StrikePlanesSubClasse;

import HomeWork3.AdditionalTaskTwo.MilitaryPlanesSubClasses.MannedSubClasses.StrikePlanes;

public class AirSupportAircraft extends StrikePlanes implements ASAActions {
    public String airSupportCraftType;
    public int ammosLeft;

    @Override
    public void stopGatlingGun() {
        System.out.println("Stops gatling gun");
    }

    @Override
    public void runGatlingGun() {
        System.out.println("Starts gatling gun");
    }
}
