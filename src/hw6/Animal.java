package hw6;

public class Animal {
    public String food;
    public String location;


    public Animal(String food, String location) {
        this.food = food;
        this.location = location;
    }

    public void makeNoise(){
        System.out.println("Some animal makes a sound.");
    }
    public void eat(){
        System.out.println("Some animal is eating.");
    }
    public void sleep(){
        System.out.println("Some animal is sleeping.");
    }


}
