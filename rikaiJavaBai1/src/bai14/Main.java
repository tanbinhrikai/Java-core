package bai14;

import java.util.Scanner;

public class Main {
    public static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap luong co ban: ");
        double luong = sc.nextDouble();

        final double BHXH_RATE = 0.08;
        final double BHYT_RATE = 0.015;
        final double BHTN_RATE = 0.01;
        final double THUE_RATE = 0.10;

        double bhxh = luong * BHXH_RATE;
        double bhyt = luong * BHYT_RATE;
        double bhtn = luong * BHTN_RATE;

        double thue = 0;
        if (luong > 11000000) {
            thue = (luong - 11000000) * THUE_RATE;
        }

        double luongThucNhan = luong - bhxh - bhyt - bhtn - thue;

        System.out.printf("Luong co ban: %,.0f\n", luong);
        System.out.printf("BHXH (8%%): %,.0f\n", bhxh);
        System.out.printf("BHYT (1.5%%): %,.0f\n", bhyt);
        System.out.printf("BHTN (1%%): %,.0f\n", bhtn);
        System.out.printf("Thue TNCN: %,.0f\n", thue);
        System.out.printf("Luong thuc nhan: %,.0f\n", luongThucNhan);

        sc.close();
    }
}