package TaskTwo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        WorkerInput workerInput = new WorkerInput();
        workerInput.inputData();
        workerInput.checkExperience();
        System.out.println(workerInput);
    }
}
