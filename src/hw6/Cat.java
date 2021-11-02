package hw6;

import java.util.Objects;

public class Cat extends Animal {

    public boolean nightVision;

    public Cat(String food, String location, boolean nightVision) {
        super(food, location);
        this.nightVision = nightVision;
    }

    @Override
    public void makeNoise() {
        System.out.println("Meow-meow");;
    }

    @Override
    public void eat() {
        System.out.println("Cat is eating.");
    }

    @Override
    public String toString() {
        return "Cat: nightVision = " + nightVision + ", food = " + food + ", location = " + location;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cat cat = (Cat) o;
        return nightVision == cat.nightVision;
    }

    @Override
    public int hashCode() {
        return Objects.hash(nightVision);
    }
}
