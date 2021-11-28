package TaskTwo;

public class Main {
    public static void main(String[] args) {
        Animals myZoo = Animals.GIRAFFE;
        System.out.println(myZoo.toString());
        myZoo.setAge(15);
        System.out.println(myZoo);
        myZoo = Animals.HORSE;
        System.out.println(myZoo);
    }
}
