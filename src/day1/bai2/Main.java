package day1.bai2;

public class Main {
    static void main() {
        byte b = 100;
        short s = 5;
        int i = 2024;
        long l = 123456789;
        float f = 3.4f;
        double d = 195.23;
        char c = 'A';
        boolean bool = true;

        System.out.printf("byte: = %d | min = %d | max = %d%n", b, Byte.MIN_VALUE, Byte.MAX_VALUE);
        System.out.printf("short: = %d | min = %d | max = %d%n", s, Short.MIN_VALUE, Short.MAX_VALUE);
        System.out.printf("int: = %d | min = %d | max = %d%n", i, Integer.MIN_VALUE, Integer.MAX_VALUE);
        System.out.printf("long: = %d | min = %d | max = %d%n", l, Long.MIN_VALUE, Long.MAX_VALUE);
        System.out.printf("float: = %f | min = %e | max = %e%n", f, Float.MIN_VALUE, Float.MAX_VALUE);
        System.out.printf("double: = %f | min = %e | max = %e%n", d, Double.MIN_VALUE, Double.MAX_VALUE);
        System.out.printf("char: = %c | min = %d | max = %d%n", c, (int) Character.MIN_VALUE, (int) Character.MAX_VALUE);
        System.out.printf("boolean: = %b | min = %b | max = %b%n", bool, Boolean.FALSE, Boolean.TRUE);

    }
}
