package day2.bai11;

import java.util.Scanner;

public class Main {
    static boolean isArmstrong(int x) {
        int length = String.valueOf(x).length();

        int temp = x;
        double n = 0;

        while(x > 0) {
            n = n + Math.pow(x % 10, length);
            x = x /10;
        }

        if(n == temp) {
            return true;
        }
        return false;
    }

    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so: ");
        int n = sc.nextInt();
        if(isArmstrong(n)) {
            System.out.printf("%d la so Armstrong %n", n);
        }

        System.out.print("So Arstrong tu 1-9999: ");
        for(int i = 1; i < 9999; i++) {
            if(isArmstrong(i)) {
                System.out.printf("%d ", i);
            }
        }


    }
}
