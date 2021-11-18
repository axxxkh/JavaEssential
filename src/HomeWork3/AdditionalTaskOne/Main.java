package HomeWork3.AdditionalTaskOne;

public class Main {
    public static void main(String[] args) {
        Printer printer = new Printer();
        Printer anotherPrinter = new LaserPrinter();

        printer.print(" superClass");
        anotherPrinter.print("subClass");
    }
}
