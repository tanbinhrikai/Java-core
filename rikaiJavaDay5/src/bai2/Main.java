package bai2;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        List<Animal> animals = List.of(
                new Dog("Dog"),
                new Cat("Cat"),
                new Bird("Bird"),
                new Dog("Dog"),
                new Cat("Cat")
        );

        Map<String, Integer> countMap = new HashMap<>();

        for (Animal animal : animals) {

            animal.speak();

            String type = animal.getClass().getSimpleName();

            countMap.put(
                    type,
                    countMap.getOrDefault(type, 0) + 1
            );
        }

        System.out.println("\n--- Count ---");
        System.out.println(countMap);
    }
}