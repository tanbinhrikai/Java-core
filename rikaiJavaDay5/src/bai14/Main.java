package bai14;

public class Main {

    public static void main(String[] args) {

        Cha a = new Child();

        a.instanceMethod();


        Cha.staticMethod();
        Child.staticMethod();


        a.staticMethod();
    }
}