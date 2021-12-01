package TaskTwo;

import java.util.Calendar;

public class Worker {
    public String workerName;
    public String workerPosition;
    public int employmentYear;

    @Override
    public String toString() {
        return workerName + " " + workerPosition + " length of service is "
                + (Calendar.getInstance().get(Calendar.YEAR) - employmentYear);
    }
}
