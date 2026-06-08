package bai2;

public class Bird extends Animal {

    public Bird(String name) {
        super(name);
    }

    @Override
    public void speak() {
        System.out.println("Tweet!");
    }
}