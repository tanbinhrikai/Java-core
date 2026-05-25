package bai6;

import java.util.Scanner;

public class Main {
    public static void main() {

        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập kWh: ");
        int kwh = sc.nextInt();

        double tongTien;

        if (kwh <= 50) {
            tongTien = kwh * 1728;
        }
        else if (kwh <= 100) {
            tongTien = 50 * 1728 + (kwh - 50) * 1786;
        }
        else if (kwh <= 200) {
            tongTien = 50 * 1728 + 50 * 1786 + (kwh - 100) * 2074;
        }
        else if (kwh <= 300) {
            tongTien = 50 * 1728 + 50 * 1786 + 100 * 2074 + (kwh - 200) * 2612;
        }
        else {
            tongTien = 50 * 1728 + 50 * 1786 + 100 * 2074 + 100 * 2612 + (kwh - 300) * 2919;
        }

        System.out.printf("Tổng tiền điện: %,.0f đồng", tongTien);

        sc.close();
    }
}