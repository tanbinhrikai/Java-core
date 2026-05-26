package day2.bai6;

import java.util.Scanner;

public class Main {
    static boolean isNguyenTo(int n) {
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if(n % i == 0) {
                return false;
            }
        }
        return true;
    }
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap n: ");
        int n = sc.nextInt();

        if(isNguyenTo(n)) {
            System.out.printf("%d la so nguyen to %n", n);
        }

        int count = 0;

        System.out.print("So nguyen to tu 1-100: ");
        for(int i = 2; i <= 100; i++) {
            if(isNguyenTo(i)) {
                count++;
                System.out.printf("%d ", i);
            }
        }

        System.out.printf("%n Tong cong: %d so nguyen to", count);

    }
}
