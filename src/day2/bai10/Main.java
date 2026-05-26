package day2.bai10;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int n = -1;

        ArrayList<Integer> numPositive = new ArrayList<>();
        ArrayList<Integer> numNegative = new ArrayList<>();
        while(n != 0) {
            System.out.println("Nhap so (nhap 0 de thoat)");
            n = sc.nextInt();

            if(n > 0) {
                numPositive.add(n);
            }
            else {
                numNegative.add(n);
            }
        }

        System.out.print("So duong: ");
        int sum = 0;
        for(int x : numPositive) {
            System.out.printf("%d ", x);
            sum += x;
        }

        System.out.print("(Skip ");
        for(int x : numNegative) {
            System.out.printf("%d ", x);
        }
        System.out.printf(")");

        System.out.printf("%n Tong so duong: %d", sum);

        System.out.printf("%n So chan khong chia het cho 4: ");
        for (int i = 1; i <= 50; i++) {
            if (i % 4 != 0 && i % 2 == 0) {
                System.out.printf("%d ", i);
            }
        }

    }
}
