package HomeWork3.AdditionalTaskOne;

public class Printer {
    public String ansiCode = "\u001B[30m";

    void print(String value) {
        System.out.println(ansiCode + "This text is colored" + value);
    }
}
