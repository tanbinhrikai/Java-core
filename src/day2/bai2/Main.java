package day2.bai2;

import java.util.Scanner;

public class Main {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        loop: while (true) {
            System.out.println("Nhap so (1-7): ");
            int n = scanner.nextInt();
            switch (n) {
                case 1 -> System.out.println("Thu 2");
                case 2 -> System.out.println("Thu 3");
                case 3 -> System.out.println("Thu 4");
                case 4 -> System.out.println("Thu 5");
                case 5 -> System.out.println("Thu 6");
                case 6 -> System.out.println("Thu 7");
                case 7 -> System.out.println("Chu nhat");
                default -> {
                    System.out.println("So khong hop le!");
                    break loop;
                }
            }
        }
    }
}
