package bai2;

public abstract class Animal {
    private String name;

    public Animal(String sound, String name) {
        this.sound = sound;
        this.name = name;
    }

    private String sound;

    public abstract void speak();

}
