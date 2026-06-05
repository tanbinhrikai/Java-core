package day5.bai15;

import java.util.ArrayList;
import java.util.List;

public class Zoo {
    List<Animal> animals = new ArrayList<>();

    public Zoo() {}

    public void addAnimal(Animal a) {
        animals.add(a);
    }

    public void feedAll() {
        int count = 0;
        for(Animal a : animals) {
            count++;
            a.feed();
        }
        System.out.println("Cho an " + count + " con vat");
    }

    public void trainAll() {
        int countTrain = 0;
        int countUntrain = 0;
        for(Animal a : animals) {
            if(a instanceof Trainable) {
                ((Trainable) a).train("");
                countTrain++;
            }
            else {
                countUntrain++;
            }
        }
        System.out.println(countTrain + " co the tap, " + countUntrain + " khong");
    }

    public void swimAll() {
        int count = 0;
        for(Animal a : animals) {
            if(a instanceof Swimmable) {
                ((Swimmable) a).swim();
                count++;
            }
        }
        System.out.println("Chi "+count + " Dolphin co the boi");
    }

    public void thongKe() {
        int countTrain = 0;
        int countSwim = 0;
        for(Animal a : animals) {
            if(a instanceof Swimmable) {
                countSwim++;
            }
            if(a instanceof  Trainable) {
                countTrain++;
            }
        }

        System.out.println("Trainable = " + countTrain + ",Swimmable = " + countSwim);
    }
}
