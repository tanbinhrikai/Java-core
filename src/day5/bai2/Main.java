package day5.bai2;

import java.util.ArrayList;
import java.util.List;

public class Main {
    static void main() {
        List<Animal> animals = new ArrayList<>();
        animals.add(new Dog());
        animals.add(new Cat());
        animals.add(new Bird());
        animals.add(new Cat());

        int countDog = 0;
        int countCat = 0;
        int countBird = 0;

        for(Animal animal : animals) {
            if(animal instanceof Dog) {
                countDog++;
            }
            else if(animal instanceof  Cat) {
                countCat++;
            }
            else if(animal instanceof  Bird) {
                countBird++;
            }
            animal.speak();
        }

        System.out.printf("%n Dog count: %d, Cat: %d, Bird: %d", countDog, countCat, countBird);
    }

}
