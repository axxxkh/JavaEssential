package HomeWork3.TaskTwo;

public class GoodPupil extends Pupil {

    public GoodPupil(String name) {
        super(name);
    }

    public GoodPupil() {
    }

    @Override
    void study() {
        System.out.println("in studying I m not so bad. i have good marks");
    }

    @Override
    void write() {
        System.out.println("in writing i can write good");
    }

    @Override
    void read() {
        System.out.println("in reading I read sometimes");
    }

    @Override
    void relax() {
        System.out.println("in relaxing I like biking and have my time");
    }
}
