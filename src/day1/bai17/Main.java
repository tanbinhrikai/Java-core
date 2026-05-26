package day1.bai17;

import java.util.Scanner;

public class Main {
    static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhap mot nam: ");
        int year = sc.nextInt();

        if(year % 400 == 0 || year % 4 == 0 && year % 100 != 0) {

        }
    }
}
