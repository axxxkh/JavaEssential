package HomeWork3.TaskTwo;

public class ExcellentPupil extends Pupil {
    //тут не зовсім зрозумів чому потрібно це писати. в теорії цей конструктор і так мав бути?
    public ExcellentPupil(String name) {
        super(name);
    }

    public ExcellentPupil() {
    }

    @Override
    void study() {
        System.out.println("in studying in study i'm best of the best");
    }

    @Override
    void write() {
        System.out.println("in writing i'm best of the best");
    }

    @Override
    void read() {
        System.out.println("in reading i'm best of the best");
    }

    @Override
    void relax() {
        System.out.println("in relax i'm best of the best");
    }
}
