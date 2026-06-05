package day5.bai3;

public class Dog extends Animal {
    public void fetch() {
        System.out.println("fetch");
    }

    @Override
    void speak() {
        System.out.print("Woof! ");
    }
}
