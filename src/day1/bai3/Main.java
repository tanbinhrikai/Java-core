package day1.bai3;

import java.util.Scanner;

public class Main {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ban kinh: ");
        double r = sc.nextDouble();
        System.out.printf("Dien tich: %.2f%n", Math.PI * r * r);
        System.out.printf("Chu vi: %.2f", 2 * Math.PI * r);
    }
}
