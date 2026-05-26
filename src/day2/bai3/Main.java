package day2.bai3;

import java.util.Scanner;

public class Main {

    static boolean isLeafYear(int year) {
        if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) {
            return true;
        }
        return false;
    }

    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap thang (1-12): ");
        int month = sc.nextInt();

        System.out.println("Nhap nam: ");
        int year = sc.nextInt();

        switch (month) {
            case 4, 6, 9, 11 -> System.out.printf("Thang %d/%d co 30 ngay", month, year);
            case 2 -> {
                if(isLeafYear(year)) {
                    System.out.printf("Thang %d/%d co 29 ngay", month, year);
                }
                else  {
                    System.out.printf("Thang %d/%d co 28 ngay", month, year);
                }
            }
            default -> System.out.printf("Thang %d/%d co 31 ngay", month, year);
        }

    }
}
