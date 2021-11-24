package TaskThree;

public class Distance {
    public double distance;

    public Distance(double distance) {
        this.distance = distance;
    }

    public Distance() {
    }

    public void print() {
        System.out.printf("%.2f miles is - %.2f km\n", distance, Converter.milesToKm(distance));
        System.out.printf("%.2f km is - %.2f miles\n", distance, Converter.kmToMiles(distance));
        System.out.printf("%.2f miles is - %.2f meters\n", distance, Converter.milesToMetres(distance));
    }

    public static class Converter {
        public static double milesToKm(double distance) {
            return distance * 1.62;
        }

        public static double kmToMiles(double distance) {
            return distance / 1.62;
        }

        public static double milesToMetres(double distance) {
            return milesToKm(distance) * 1000;
        }
    }

    public static void main(String[] args) {
        System.out.println(Converter.milesToKm(100));
        System.out.println((Converter.kmToMiles(510)));

        Distance distance = new Distance(10L);
        distance.print();
    }
}
