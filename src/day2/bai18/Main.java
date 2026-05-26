package day2.bai18;

import java.util.Scanner;

public class Main {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so nguyen: ");
        int n = sc.nextInt();

        int temp = n;

        int res = 0;
        while (n != 0) {
            int remain = n % 10;
            res = res * 10 + remain;
            n = n / 10;
        }

        System.out.printf("Dao nguoc %d %n", res);
        if(res == temp) {
            System.out.printf("%d la so palindrome!", res);
        }

    }
}
