package TaskTwo;

import java.util.Comparator;

class SortWorkersByEmploymentYear implements Comparator<Worker> {
    public int compare(Worker firstWorker, Worker secondWorker) {
        return secondWorker.employmentYear - firstWorker.employmentYear;
    }
}

