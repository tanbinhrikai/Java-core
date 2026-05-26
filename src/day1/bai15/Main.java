package day1.bai15;

import java.util.Scanner;

public class Main {
    static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhap so giay: ");
        long l = sc.nextLong();

        long hour = l / 3600;
        long minute = (l % 3600) / 60;
        long second = l % 60;

        System.out.printf("%d gio %d phut %d giay", hour, minute, second);
    }
}
