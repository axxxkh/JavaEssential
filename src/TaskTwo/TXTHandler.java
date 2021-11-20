package TaskTwo;

public class TXTHandler extends AbstractHandler {
    @Override
    void open() {
        System.out.println("TXT file is open");
    }

    @Override
    void create() {
        System.out.println("TXT file created");
    }

    @Override
    void save() {
        System.out.println("TXT File is saved");
    }
}
