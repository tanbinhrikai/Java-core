package day2.bai12;

import java.util.Scanner;

public class Main {
    static int gcdWithWhile(int a, int b) {
        while(b != 0) {
            int t = b;
            b = a % b;
            a  = t;
        }
        return a;
    }

    static int gcdWithRecursion(int a, int b) {
        if (b == 0)
            return a;
        return gcdWithRecursion(b, a % b);
    }

    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap 2 so nguyen: ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.printf("GCD (Euclid) %d %n", gcdWithWhile(a, b));
        System.out.printf("GCD (Recursion) %d %n", gcdWithRecursion(a, b));
        System.out.printf("BSCNN(%d, %d) = %d * %d / %d = %d", a, b, a , b , gcdWithRecursion(a, b), a * b / gcdWithRecursion(a, b));
    }
}
