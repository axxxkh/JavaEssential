package HomeWork3.TaskTwo;

public class ClassRoom {

    public ClassRoom(Pupil... pupil) {

        for (int i = 0; i < pupil.length; i++) {
            System.out.println("hi, I’m " + pupil[i].getClass().getSimpleName() + ". my name is " + pupil[i].name);

            pupil[i].study();
            pupil[i].read();
            pupil[i].relax();
            pupil[i].write();
        }
    }

    public ClassRoom() {

    }
}
