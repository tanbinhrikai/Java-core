package day2.bai13;

import java.util.Scanner;

public class Main {
    static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhap so nguen duong n: ");
        int n =  sc.nextInt();

        int sum = 0;
        int count = 0;
        String s = "";
        while(n != 0) {
            sum += n % 10;
            s += n % 10 + " ";
            n = n / 10;
            count++;
        }
        System.out.printf("So chu so: %d %n", count);
        System.out.printf("Tong: %d %n", sum);
        System.out.printf("Chu so tu phai sang trai: %s", s);
    }
}
