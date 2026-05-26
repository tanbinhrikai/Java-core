package day1.bai4;

import java.util.Scanner;

public class Main {
    static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhap can nang: ");
        double weight = sc.nextDouble();

        System.out.println("Nhap chieu cao: ");
        double height = sc.nextDouble();

        double BMI = weight / (height * height);

        if(BMI < 18.5) {
            System.out.printf("BMI: %.2f - Gay", BMI);
        }
        else if (BMI >= 18.5 && BMI < 25) {
            System.out.printf("BMI: %.2f - Binh Thuong", BMI);
        }
        else {
            System.out.printf("BMI: %.2f - Beo phi", BMI);
        }

    }
}
