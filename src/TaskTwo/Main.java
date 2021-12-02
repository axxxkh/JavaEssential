package TaskTwo;

public class Main {
    public static void main(String[] args) {
        Monitor monitor = new Monitor("Samsung", 1222, "asdfg", 8096, 4048);
        System.out.println(monitor);

        Monitor lg = new Monitor("Lg", 1222, "FSDF", 800, 600);
        System.out.println(lg.equals(monitor));
        System.out.println(monitor.hashCode());
    }
}
