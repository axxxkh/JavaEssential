package HomeWork3.TaskTwo;

public class Pupil {

    public String name;

    void relax() {
        System.out.println(getClass());
    }

    void read() {
        System.out.println("read");
    }

    void write() {
        System.out.println("write");
    }

    void study() {
        System.out.println("study");
    }

    public Pupil(String name) {
        this.name = name;
    }

    public Pupil() {
    }
}