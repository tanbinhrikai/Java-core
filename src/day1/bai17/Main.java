package day1.bai17;

import java.util.Scanner;

public class Main {
    static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhap mot nam: ");
        int year = sc.nextInt();

        if(year % 400 == 0 || year % 4 == 0 && year % 100 != 0) {
            System.out.printf("%d Nam nhuan, thang 2 co 29 ngay %n", year);
        }
        else {
            System.out.printf("%d Khong nhuan, thang 2 co 28 ngay %n", year);
        }
    }
}
