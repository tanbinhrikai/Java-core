package bai3;

import bai2.Animal;
import bai2.Bird;
import bai2.Cat;
import bai2.Dog;

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
        for(Animal animal : animals) {
            if(animal instanceof Dog dogg) {
                dogg.fetch();
            }
        }

    }
}
