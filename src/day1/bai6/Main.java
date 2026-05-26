package day1.bai6;

import java.util.Scanner;

public class Main {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("So Kwh");
        int kWh = sc.nextInt();

        double tienDien = 0;
        if (kWh > 300) {
            tienDien = tienDien + (kWh - 300) * 2.919;
            kWh = 300;
        }
        if(kWh >= 201) {
            tienDien = tienDien + (kWh - 200) * 2.612;
            kWh = 200;
        }
        if(kWh >= 101) {
            tienDien = tienDien + (kWh - 100) * 2.074;
            kWh = 100;
        }
        if(kWh >= 51) {
            tienDien = tienDien + (kWh - 50) * 1.786;
            kWh = 50;
        }
        tienDien = tienDien + kWh * 1.728;

        System.out.printf("Tien dien %.2f", tienDien);

    }
}
