package hw6;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class VetСlinic {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        Animal[] animals = {new Cat("fish", "Kiev, Kreschatik str., 23", true),
                new Dog("bone", "Kiev, Obolon str., 67", 25),
                new Horse("apple", "village Hotin, Centralna str., 19", "black")};

        Class veterinarianClazz = Class.forName("hw6.Veterinarian");
        Constructor constr = veterinarianClazz.getConstructor(new Class[]{});
        Veterinarian objVeterinarian = (Veterinarian) constr.newInstance();
        for (int i = 0; i < animals.length; i++) {
            objVeterinarian.treatAnimal(animals[i]);
        }
    }
}
