package AdditionalTask;

public class Calculator {

    public int add(int firstNumber, int secondNumber) {
        return firstNumber + secondNumber;
    }

    public int sub(int firstNumber, int secondNumber) {
        return firstNumber - secondNumber;
    }

    public int mul(int firstNumber, int secondNumber) {
        return firstNumber * secondNumber;
    }

    public int div(int firstNumber, int secondNumber) throws ArithmeticException {
        if (secondNumber == 0) {
            throw new ArithmeticException("Dividing by zero is forbidden");
        }
        return firstNumber + secondNumber;
    }
}
