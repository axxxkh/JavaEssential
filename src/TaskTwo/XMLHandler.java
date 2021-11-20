package TaskTwo;

public class XMLHandler extends AbstractHandler {
    public String file;

    @Override
    void open() {
        System.out.println("XML file is open");
    }

    @Override
    void create() {
        System.out.println("XML file created");
    }

    @Override
    void save() {
        System.out.println("XML file is saved");
    }
}
