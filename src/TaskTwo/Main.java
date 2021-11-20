package TaskTwo;

public class Main {
    public static void main(String[] args) {
        AbstractHandler myFile = new DOCHandler("aasaa");

        if (myFile.getClass() == XMLHandler.class) {
            myFile.create();
            myFile.open("fdgdfg
            myFile.change();
            myFile.save();
        } else
            if (myFile.getClass() == DOCHandler.class) {
            myFile.create();
            myFile.open("123");
            myFile.change();
            myFile.save();
        } else if (myFile.getClass() == TXTHandler.class) {
            myFile.create();
            myFile.open("6464");
            myFile.change();
            myFile.save();
        }

    }
}
