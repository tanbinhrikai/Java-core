package bai14;

public class Child extends Cha {

    @Override
    public void instanceMethod() {
        System.out.println("Con.instanceMethod()");
    }

    public static void staticMethod() {
        System.out.println("Con.staticMethod()");
    }
}