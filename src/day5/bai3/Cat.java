package day5.bai3;

public class Cat extends Animal {
    public void purr() {
        System.out.println("purr");
    }

    @Override
    void speak() {
        System.out.print("Meow! ");
    }
}
