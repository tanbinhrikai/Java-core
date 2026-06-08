package bai3;

import bai2.Animal;
import bai2.Bird;
import bai2.Cat;
import bai2.Dog;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Animal> animals = new ArrayList<>();

        animals.add(new Cat("Cat"));
        animals.add(new Dog("Dog"));
        animals.add(new Bird("Bird"));
        animals.add(new Dog("Dog"));

        System.out.println(" Pattern Matching ");
        for (Animal animal : animals) {

            if (animal instanceof Dog dog) {
                dog.fetch();
            }
        }

        // 2. cách cũ
        for (Animal animal : animals) {

            if (animal instanceof Dog) {
                Dog d = (Dog) animal;
                d.fetch();
            }
        }


    }
}