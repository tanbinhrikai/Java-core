package day5.bai3;

import day5.bai3.Animal;
import day5.bai3.Bird;
import day5.bai3.Cat;
import day5.bai3.Dog;

import java.util.ArrayList;
import java.util.List;

public class Main {
    static void main() {
        List<Animal> animals = new ArrayList<>();
        animals.add(new Dog());
        animals.add(new Cat());
        animals.add(new Bird());
        animals.add(new Cat());

        for(Animal a : animals) {
//           try {
//               Dog d = (Dog) a;
//               d.fetch();
//           } catch (ClassCastException c) {
//               System.out.println(c.getMessage());
//           }

            if(a instanceof Dog) {
                Dog d = (Dog) a;
                d.fetch();
            }
        }

        for(Animal a : animals) {
            if(a instanceof Dog d) {
                d.fetch();
            }
        }

        for(Animal a : animals) {
            switch (a) {
                case Dog d -> d.fetch();
                case Cat c -> c.purr();

                default -> throw new IllegalStateException("Unexpected value: " + a);
            }
        }
    }
}
