package TaskTwo;

public class DOCHandler extends AbstractHandler {
    @Override
    void open() {
        System.out.println("DOC file is open");
    }

    @Override
    void create() {
        System.out.println("DOC file created");
    }

    @Override
    void save() {
        System.out.println("DOC file is saved");
    }
}
