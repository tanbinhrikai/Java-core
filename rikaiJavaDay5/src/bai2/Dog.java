package bai2;

public class Dog extends Animal{

    public Dog(String sound, String name) {
        super(sound, name);
    }

    @Override
    public void speak() {
        System.out.println("gau gau");
    }


    public void fetch(){

    }



}
