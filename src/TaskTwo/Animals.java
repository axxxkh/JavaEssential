package TaskTwo;

public enum Animals {
    HORSE(50), UNICORN(15), ZEBRA(10), GIRAFFE(20), KANGAROO(5);
    public int age;

    @Override
    public String toString() {
        return "Animal is " + name() + " age is " + age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    Animals(int age) {
        this.age = age;
    }
}
