package day1.bai18;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhap so tien goc: ");
        double p = sc.nextDouble();

        System.out.println("Nhap lai suat: ");
        double r = sc.nextDouble();

        System.out.println("Nhap so ky: ");
        int n = sc.nextInt();

        double I = p * r * n / 100; // chỉ tính tiền lãi
        double A = p * Math.pow(1 + r / 100, n); // đã tính lãi + vốn

        System.out.printf("Lai don: %,.0f | Tong: %,.0f %n", I, I + p);
        System.out.printf("Lai kep: %,.0f | Tong: %,.0f", A - p, A);
    }
}
