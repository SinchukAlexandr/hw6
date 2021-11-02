package hw6;

import java.util.Objects;

public class Horse extends Animal {

    public String saddleColor;

    public Horse(String food, String location, String saddleColor){
        super(food, location);
        this.saddleColor = saddleColor;
    }

    @Override
    public void makeNoise() {
        System.out.println("Yogogo-yogogo");
    }

    @Override
    public void eat() {
        System.out.println("Horse is eating.");
    }
    @Override
    public String toString() {
        return "Horse: saddleColor = " + saddleColor + ", food = " + food + ", location = " + location;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Horse horse = (Horse) o;
        return Objects.equals(saddleColor, horse.saddleColor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(saddleColor);
    }
}
