package hw6;

import java.util.Objects;

public class Dog extends Animal {

    public int collarSize;

    public Dog(String food, String location, int collarSize) {
        super(food, location);
        this.collarSize = collarSize;
    }

    @Override
    public void makeNoise() {
        System.out.println("Woof-woof");
    }

    @Override
    public void eat() {
        System.out.println("Dog is eating.");
    }

    @Override
    public String toString() {
        return "Dog: collarSize = " + collarSize + ", food = " + food + ", location = " + location;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dog dog = (Dog) o;
        return collarSize == dog.collarSize;
    }

    @Override
    public int hashCode() {
        return Objects.hash(collarSize);
    }
}
