package bai11;

public class Main {
    public static void main() {

        byte b = 42;
        short s = b;
        int i = s;
        long l = i;
        float f = l;
        double d = f;

        System.out.println(b + " (byte)");
        System.out.println("-> " + s + " (short)");
        System.out.println("-> " + i + " (int)");
        System.out.println("-> " + l + "L (long)");
        System.out.println("-> " + f + "f (float)");
        System.out.println("-> " + d + " (double)");


        char ch = 'A';
        int ascii = ch;

        System.out.println("Char to int:");
        System.out.println("'" + ch + "' -> " + ascii);
    }
}