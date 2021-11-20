package TaskTwo;

public class TXTHandler extends AbstractHandler {
    @Override
    void open(String docType) {
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

    public TXTHandler(String docType) {
        super(docType);
    }
}
