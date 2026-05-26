package day1.bai20;

import java.util.Scanner;

public class Main {
    static final double METTER_TO_KM = 0.001;
    static final double METTER_TO_CM = 100;
    static final double METTER_TO_INCH = 39.37;
    static final double METTER_TO_FEET = 3.28;

    static final double KG_TO_G = 1000;
    static final double KG_TO_POUND = 2.20462;
    static final double KG_TO_OUNCE = 35.2739619;

    static void main() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.printf("=== DON VI CHUYEN DOI ===\n" +
                    "1. Do dai  2. Khoi luong  3. Nhiet do  0. Thoat");

            System.out.println("Chon: ");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Nhap gia tri: ");
                    double n = sc.nextDouble();
                    System.out.printf("%.4f m = %.4f cm = %.4f km = %.4f inch = %.4f feet %n", n, n * METTER_TO_CM, n * METTER_TO_KM, n * METTER_TO_INCH, n * METTER_TO_FEET);
                    break;
                case 2:
                    System.out.println("Nhap gia tri: ");
                    double kl = sc.nextDouble();
                    System.out.printf("%.4f kg = %.4f g = %.4f pound = %.4f ounce %n", kl, kl * KG_TO_G, kl * KG_TO_POUND, kl * KG_TO_OUNCE);
                    break;
                case 3:
                    System.out.println("Nhap gia tri: ");
                    double nhietDo = sc.nextDouble();
                    System.out.printf("%.4f C = %.4f F = %.4f K %n", nhietDo, nhietDo * 1.8 + 32, nhietDo + 273.15);
                    break;
                case 0:
                    return;
            }
        }
    }
}
