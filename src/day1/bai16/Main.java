package day1.bai16;

import java.util.Scanner;

public class Main {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so: ");
        int x = sc.nextInt();
        int result = 0;
        while (x != 0) {
            result += x % 10;
            x = x / 10;
        }
        System.out.printf("Tong cac chu so: %d", result);
    }
}
