package HomeWork3.TaskTwo;

public class BadPupil extends Pupil {

    public BadPupil(String name) {
        super(name);
    }

    public BadPupil() {
    }
    @Override
    void relax() {
        System.out.println("Ofcource i can relax. I never tired because of study");
    }

    @Override
    void read() {
        System.out.println("i can read, but by every letter, and very slowly");
    }

    @Override
    void study() {
        System.out.println("in styudying I'm not good");
    }

    @Override
    void write() {
        System.out.println("My writings are bad.");
    }
}
