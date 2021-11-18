package HomeWork3.TaskFour;

public class ProDocumentWorker extends DocumentWorker {

    @Override
    public void editDocument() {
        System.out.println("Document have been edited");
    }

    @Override
    public void saveDocument() {
        System.out.println("Document have been saved in old format. To save in new buy Expert version");
    }
}
