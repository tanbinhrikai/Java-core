package bai2;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Animal> animals = new ArrayList<Animal>();
        Cat cat = new Cat("meo meo", "cat");
        Dog dog = new Dog("meo", "dog");
        Bird bird = new Bird("meo", "bird");
        animals.add(cat);
        animals.add(dog);
        animals.add(bird);
        int catNumber = 0;
        int dogNumber = 0;
        int birdNumber = 0;
        for (Animal animal : animals) {
            if (animal instanceof Cat) {
                catNumber++;
            }
            if (animal instanceof Dog) {
                dogNumber++;
            }
            if (animal instanceof Bird) {
                birdNumber++;
            }
        }
        animals.forEach(animal -> animal.speak());
    }
}
