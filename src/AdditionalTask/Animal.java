package AdditionalTask;

public class Animal implements Comparable<Animal> { // <Animal>{
    String breed;
    int weight;
    int speed;
    int price;

    Animal(String breed, int weight, int speed, int price) {
        this.breed = breed;
        this.weight = weight;
        this.speed = speed;
        this.price = price;
    }

    public String toString() {
        return this.breed + " " + this.weight + " " + this.speed + " " + this.price;
    }

    @Override
    public int compareTo(Animal o) {
        if (this.speed - o.speed == 0) {
            if (this.price - o.price == 0) {
                if (this.weight - o.weight == 0) {
                    return this.breed.compareTo(o.breed);
                } else if (this.weight - o.weight > 0) {
                    return -1;
                } else {
                    return 1;
                }
            } else if (this.price - o.price > 0) {
                return -1;
            } else {
                return 1;
            }
        } else if (this.speed - o.speed > 0) {
            return -1;
        } else {
            return 1;
        }
    }
}