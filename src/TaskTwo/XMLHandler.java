package TaskTwo;

public class XMLHandler extends AbstractHandler {

    @Override
    void open(String docType) {
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

    public XMLHandler(String docType) {
        super(docType);
    }
}
