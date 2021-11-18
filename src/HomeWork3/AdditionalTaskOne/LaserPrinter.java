package HomeWork3.AdditionalTaskOne;

public class LaserPrinter extends Printer {
    @Override
    void print(String value) {
        int number;
        number = (int) (Math.random() * 99);
        System.out.println("\u001B[1;" + String.valueOf(number) + "m" + value);
    }
}
