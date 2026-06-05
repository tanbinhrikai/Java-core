package day5.bai14;

public class Main {
    static void main() {
        Cha obj = new Con();
        System.out.print("obj.instanceMethod() ");
        obj.instanceMethod();

        System.out.print("obj.staticMethod()   ");
        obj.staticMethod(); // static method thuoc ve class
        Cha.staticMethod();
    }
}
