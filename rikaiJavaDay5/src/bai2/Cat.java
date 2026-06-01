package bai2;

public class Cat extends Animal {
    public Cat(String sound, String name) {
        super(sound, name);
    }

    @Override
    public void speak() {
        System.out.println("meo meo");
    }
}
