package TaskTwo;

import java.util.Arrays;
import java.util.Calendar;
import java.util.InputMismatchException;
import java.util.Scanner;

class WorkerInput {
    public final int COMPANY_FOUNDATION = 1990;
    public final boolean EMPLOYMENT_YEAR = true;
    public final boolean SERVICE_YEARS = false;
    public Scanner input = new Scanner(System.in);
    Worker[] workersArray = new Worker[2];

    private void checkEmploymentYear(int year) throws WrongYearException {
        if ((year > Calendar.getInstance().get(Calendar.YEAR)) ||
                year < COMPANY_FOUNDATION) {
            throw new WrongYearException();
        }
    }

    private int checkInputYear(boolean checkServiceOrEmployment) {
        boolean check = true;
        int employmentYear = 0;
        do {
            try {
                // розумію що можна без == але тоді важче читати по ідеї, а так то більш зрозуміло
                if (checkServiceOrEmployment == EMPLOYMENT_YEAR) {
                    checkEmploymentYear(employmentYear = input.nextInt());
                } else {
                    return input.nextInt();
                }
                check = false;
            } catch (InputMismatchException exception) {
                System.out.println("its not a year, try again, we will not stop until you enter a  number, " +
                        "and then we will check if this number is acceptable");
                input.nextLine();
            } catch (WrongYearException exception) {
                System.out.printf("its not acceptable year of the employment. Enter year after company created (%d) and " +
                        "not bigger than current year (%d)\n", COMPANY_FOUNDATION, Calendar.getInstance().get(Calendar.YEAR));
            }
        } while (check);
        return employmentYear;
    }

    public void inputData() {
        for (int i = 0; i < 2; i++) {
            workersArray[i] = new Worker();
            System.out.printf("Input %d worker surname and initials\n", i + 1);
            workersArray[i].workerName = input.next();
            System.out.printf("Input %s position \n", workersArray[i].workerName);
            workersArray[i].workerPosition = input.next();
            System.out.printf("input year when %s start works \n", workersArray[i].workerName);
            workersArray[i].employmentYear = checkInputYear(EMPLOYMENT_YEAR);
        }
        Arrays.sort((workersArray), new SortWorkersByEmploymentYear());
    }

    public void checkExperience() {
        System.out.println("Enter length of service to check employees");
        int serviceYears = checkInputYear(SERVICE_YEARS);
        for (Worker workers : workersArray) {
            if (Calendar.getInstance().get(Calendar.YEAR) - workers.employmentYear > serviceYears) {
                System.out.println(workers);
            }
        }
    }

    @Override
    public String toString() {
        String returnAllWorkers = "";
        for (Worker worker : workersArray) {
            returnAllWorkers += worker.toString() + '\n';
        }
        return returnAllWorkers;
    }
}
