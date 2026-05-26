package day1.bai5;

import java.util.Scanner;

public class Main {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhiet do: ");
        double nhietDo = sc.nextDouble();
        sc.nextLine();
        System.out.println("Don Vi (C/F): ");
        String donVi = sc.nextLine();
        double result;
        if(donVi.equals("F")) {
            result = (nhietDo - 32) * 5 / 9;
            System.out.printf("%.2f°F = %.2f°C", nhietDo, result);
        }
        if(donVi.equals("C")) {
            result = nhietDo * 9/5 + 32;
            System.out.printf("%.2f°C = %.2f°F", nhietDo, result);
        }


    }
}
