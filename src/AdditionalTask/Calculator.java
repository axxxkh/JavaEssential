package AdditionalTask;

public class Calculator {
    public static double multiply(double firstNumber, double secondNumber) {
        return firstNumber * secondNumber;
    }

    public static double divide(double dividen, double diveder) {
        if (diveder != 0) {
            return dividen / diveder;
        }
        return dividen;
    }

    public static double add(double firstNumber, double secondNumber) {
        return firstNumber + secondNumber;
    }

    public static double minus(double firstNumber, double secondNumber) {
        return firstNumber + secondNumber;
    }

}
