package TaskTwo;

public class Main {
    public static void main(String[] args) {
        AbstractHandler myFile = new DOCHandler();

        if (myFile.getClass() == XMLHandler.class) {
            myFile.create();
            myFile.open();
            myFile.change();
            myFile.save();
        } else if (myFile.getClass() == DOCHandler.class) {
            myFile.create();
            myFile.open();
            myFile.change();
            myFile.save();
        } else if (myFile.getClass() == TXTHandler.class) {
            myFile.create();
            myFile.open();
            myFile.change();
            myFile.save();
        }
    }
}
