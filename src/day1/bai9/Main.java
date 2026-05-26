package day1.bai9;

public class Main {
    static void main() {
        int n = 42;
        Integer atb = n; // autoBoxing

        Integer x = 100;
        int ubx = x; // Unboxing

        System.out.printf("Autoboxing: %d -> Integer(%d) %n", n, atb);
        System.out.printf("Unboxing: Integer(%d) -> %d %n", x, ubx);

        Double z = null;
        double m = 0;
        if(z != null) m = z;

        // Khong an toan: Double z = null; double m=z; -> NPE!
        // System.out.println(m);
        System.out.println("Khong an toan: Integer n=null; int x=n; -> NPE!");

        System.out.println("An toan: if (n != null) int x = n;");
        System.out.println("Unboxing null tương đương gọi null.intValue() → NPE. Luôn kiểm tra null");
    }
}
