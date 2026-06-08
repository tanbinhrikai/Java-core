package bai2;

public class Dog extends Animal {

    public Dog(String name) {
        super(name);
    }

    @Override
    public void speak() {
        System.out.println("Woof!");
    }

    public void fetch() {
        System.out.println("Dog is fetching...");
    }
}