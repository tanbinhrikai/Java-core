package day5.bai3;

public class Bird extends Animal {
    public void fly() {
        System.out.println("fly");
    }

    @Override
    void speak() {
        System.out.print("Tweet! ");
    }
}
