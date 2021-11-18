package HomeWork3.TaskFour;

import java.util.Scanner;

public class Main {
    public static Scanner input = new Scanner(System.in);
    public static int proKey = 12345;
    public static int expKey = 12345678;


    public static void main(String[] args) {
        int userKey;
        DocumentWorker userDocumentWorker;

        System.out.println("Enter serial number for Pro or Expert version");
        userKey = input.nextInt();

        if (userKey == expKey) {
            userDocumentWorker = new ExpertDocumentWorker();
        } else if (userKey == proKey) {
            userDocumentWorker = new ProDocumentWorker();
        } else {
            userDocumentWorker = new DocumentWorker();
        }

        userDocumentWorker.openDocument();
        userDocumentWorker.editDocument();
        userDocumentWorker.saveDocument();
    }
}
