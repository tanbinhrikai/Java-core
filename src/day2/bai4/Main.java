package day2.bai4;

import java.util.Scanner;

public class Main {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap 3 so nguyen: ");
        int a, b, c;
        a =  sc.nextInt();
        b =  sc.nextInt();
        c=sc.nextInt();

        if(a > b && a > c) {
            System.out.println(a);
        }
        if(b > a && b > c) {
            System.out.println(b);
        }
        if(c > a && c > b) {
            System.out.println(c);
        }

        System.out.printf("%d %n", a > b ? a > c ? a : c : b > c ? b : c);

        System.out.printf("%d", Math.max(a, Math.max(b, c)));
    }
}
