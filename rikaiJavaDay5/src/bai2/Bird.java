package bai2;

public class Bird extends Animal{
    public Bird(String sound, String name) {
        super(sound, name);
    }

    @Override
    public void speak() {
        System.out.println("woof");
    }
}
