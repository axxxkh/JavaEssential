package TaskTwo;

public class DOCHandler extends AbstractHandler {
    @Override
    void open(String docType) {
        System.out.println("DOC file is open"+docType);
    }

    @Override
    void create() {
        System.out.println("DOC file created");
    }

    @Override
    void save() {
        System.out.println("DOC file is saved");
    }

    public DOCHandler(String docType) {
        super(docType);
    }
}
