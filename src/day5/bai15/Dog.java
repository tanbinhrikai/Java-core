package day5.bai15;

public class Dog extends Animal implements Trainable{
    @Override
    void feed() {

    }

    @Override
    void sound() {

    }

    @Override
    public boolean train(String command) {
        return false;
    }
}
