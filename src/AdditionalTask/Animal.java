package AdditionalTask;

import java.util.Objects;

public class Animal {
    String name;
    int age;
    boolean hasTail;

    public Animal(String name, int age, boolean hasTail) {
        this.name = name;
        this.age = age;
        this.hasTail = hasTail;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return age == animal.age && hasTail == animal.hasTail && name.equals(animal.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, hasTail);
    }

    @Override
    public String toString() {
        return "Animal " + "name=" + name + ", age=" + age + ", Tail: " + hasTail;
    }
}
