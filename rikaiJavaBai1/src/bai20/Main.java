package bai20;

import java.util.Scanner;

public class Main {

    public static final double METER_TO_CM = 100.0;
    public static final double METER_TO_KM = 0.001;
    public static final double METER_TO_INCH = 39.37;
    public static final double METER_TO_FEET = 3.28084;

    public static final double KG_TO_G = 1000.0;
    public static final double KG_TO_POUND = 2.20462;
    public static final double KG_TO_OUNCE = 35.274;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int choice;

        do {

            System.out.println("1. Do dai");
            System.out.println("2. Khoi luong");
            System.out.println("3. Nhiet do");
            System.out.println("0. Thoat");

            System.out.print("Chon: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    convertLength(sc);
                    break;

                case 2:
                    convertWeight(sc);
                    break;

                case 3:
                    convertTemperature(sc);
                    break;

                case 0:
                    System.out.println("Tam biet!");
                    break;

                default:
                    System.out.println("Lua chon khong hop le!");
            }

        } while (choice != 0);

        sc.close();
    }

    public static void convertLength(Scanner sc) {

        System.out.print("Nhap gia tri (m): ");
        double meter = sc.nextDouble();

        double cm = meter * METER_TO_CM;
        double km = meter * METER_TO_KM;
        double inch = meter * METER_TO_INCH;
        double feet = meter * METER_TO_FEET;

        System.out.println(meter + " m = " + cm + " cm");
        System.out.println(meter + " m = " + km + " km");
        System.out.println(meter + " m = " + inch + " inch");
        System.out.println(meter + " m = " + feet + " feet");
    }

    public static void convertWeight(Scanner sc) {

        System.out.print("Nhap gia tri (kg): ");
        double kg = sc.nextDouble();

        double g = kg * KG_TO_G;
        double pound = kg * KG_TO_POUND;
        double ounce = kg * KG_TO_OUNCE;

        System.out.println(kg + " kg = " + g + " g");
        System.out.println(kg + " kg = " + pound + " pound");
        System.out.println(kg + " kg = " + ounce + " ounce");
    }

    public static void convertTemperature(Scanner sc) {

        System.out.print("Nhap nhiet do (C): ");
        double c = sc.nextDouble();

        double f = (c * 9 / 5) + 32;
        double k = c + 273.15;

        System.out.println(c + " C = " + f + " F");
        System.out.println(c + " C = " + k + " K");
    }
}