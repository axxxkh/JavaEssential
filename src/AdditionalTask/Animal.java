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

    // Сортируем по скорости/цене
//    public int compareTo(Animal o) {              //    public int compareTo(Animal o) {
//        int tmp = this.speed - o.speed; //    int tmp = this.speed - o.speed;
//
//        if (tmp == 0) {
//            return this.price - o.price;
//        } else {
//            return tmp;
//        }
//    }

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

    // Сравнение 2-х строковых значений
    // return this.breed.compareTo(((Animal)o).breed);
}