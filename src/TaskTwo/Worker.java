package TaskTwo;

import java.util.Calendar;

public class Worker {
    String workerName;
    String workerPosition;
    int employmentYear;

    @Override
    public String toString() {
        return workerName + " " + workerPosition + " length of service is "
                + (Calendar.getInstance().get(Calendar.YEAR) - employmentYear);
    }
}
