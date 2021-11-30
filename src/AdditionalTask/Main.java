package AdditionalTask;

public class Main {
    public static void main(String[] args) {
        int firstNumber = 100;
        int secondNumber = 0;

        Calculator calculator = new Calculator();
        System.out.println(calculator.add(firstNumber, secondNumber));
        System.out.println(calculator.sub(firstNumber, secondNumber));
        System.out.println(calculator.mul(firstNumber, secondNumber));
        System.out.println(calculator.div(firstNumber, secondNumber));
    }
}
