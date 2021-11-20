package TaskTwo;

abstract class AbstractHandler {
    public String docType;
    abstract void open(String docType);

    abstract void create();

    void change() {

        System.out.println("You can change file"+docType);
    }

    abstract void save();

    public AbstractHandler(String docType) {
        this.docType=docType;
        open(docType);
    }
}
