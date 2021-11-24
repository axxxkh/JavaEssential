package AdditionalTask;

public class Main {
    public static void main(String[] args) {
        double firstNumber = 0.154;
        double secondNumber = 545840.051;

        System.out.println("Multiply result is " + Calculator.multiply(firstNumber, secondNumber));
        System.out.println("Sum result is " + Calculator.add(firstNumber, secondNumber));
        System.out.println("Divide result is " + Calculator.divide(firstNumber, secondNumber));
        System.out.println("Minus result is " + Calculator.minus(firstNumber, secondNumber));
    }
}
