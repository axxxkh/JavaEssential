package HomeWork3.TaskTwo;

public class Main {
    public static void main(String[] args) {
        Pupil adam = new BadPupil("Adam");
        Pupil jack = new GoodPupil("Jack");
        Pupil antony = new ExcellentPupil("Antony");

        ClassRoom myClass = new ClassRoom(adam, jack, antony);
    }
}
