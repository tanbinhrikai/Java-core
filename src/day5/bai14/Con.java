package day5.bai14;

public class Con extends Cha {

    @Override
    public void instanceMethod() {
        System.out.println("-> Gọi: Con.instanceMethod (OVERRIDE thành công)");
    }

    // Hide static method của cha (Không dùng @Override ở đây được)
    public static void staticMethod() {
        System.out.println("-> Gọi: Con.staticMethod (HIDING xảy ra)");
    }
}
