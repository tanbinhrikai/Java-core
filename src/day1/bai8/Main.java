package day1.bai8;

public class Main {
    static void main() {
        Integer a = 127;
        Integer b = 127;
        System.out.printf("Integer a = %d, b = %d; a == b -> %b %n", a, b, a == b);

        Integer c = 200;
        Integer d = 200;
        System.out.printf("Integer c = %d, d = %d; c == d -> %b %n", c, d, c == d);
        System.out.printf("c.equals(d) -> %b %n", c.equals(d));

        System.out.println("JVM cache Integer từ -128 đến 127. Ngoài range này tạo object mới trên heap => == se so sanh dia chi");
        System.out.println("Luôn dùng .equals() để so sánh đúng");
    }
}
