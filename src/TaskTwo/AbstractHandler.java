package TaskTwo;

abstract class AbstractHandler {

    abstract void open();

    abstract void create();

    void change() {
        System.out.println("You can change file");
    }

    abstract void save();
}
