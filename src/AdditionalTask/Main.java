package AdditionalTask;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> teachers = new ArrayList<>();
        teachers.add("Світлана Володимирівна");
        teachers.add("Леонід Григорович");
        teachers.add("Анжела Юріївна");
        teachers.add("Наталья Омельянівна");
        System.out.println(teachers.indexOf("Анжела Юріївна"));
        System.out.println(teachers);
    }
}
