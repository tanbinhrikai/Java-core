package day1.bai11;

public class Main {
    static void main() {
        byte b = 42;
        short s = b;
        int i = s;
        long l = i;
        float f = l;
        double d = f;

        char c = 65;
        int as = c;

        System.out.printf("%d (byte) -> %d (short) -> %d (int) -> %dL (long)\n" +
                "%dL -> %f (float) -> %f (double)\n" +
                "char '%c' -> int %d", b ,s,i,l,l,f,d,c,as);
    }
}
