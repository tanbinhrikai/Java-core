package bai8;

public class Main {
    public void main() {
        Integer a = 127;
        Integer b = 127;

        System.out.println("a = 127, b = 127");
        System.out.println("a == b      : " + (a == b));
        System.out.println("a.equals(b) : " + a.equals(b));


        Integer x = 128;
        Integer y = 128;

        System.out.println("x = 128, y = 128");
        System.out.println("x == y      : " + (x == y));
        System.out.println("x.equals(y) : " + x.equals(y));


        Integer m = -129;
        Integer n = -129;

        System.out.println("m = -129, n = -129");
        System.out.println("m == n      : " + (m == n));
        System.out.println("m.equals(n) : " + m.equals(n));


        Integer p = 200;
        Integer q = 200;

        System.out.println("p = 200, q = 200");
        System.out.println("p == q      : " + (p == q));
        System.out.println("p.equals(q) : " + p.equals(q));


    }

}
