package day1.bai13;

import java.util.Scanner;

public class Main {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ky tu: ");
        char c = sc.next().charAt(0);

        System.out.println("Ma ASCII: " + (int) c);
        System.out.println("Ky tu tiep: " + (char) (c + 1));
        System.out.println("Chu Hoa: " + Character.toUpperCase(c));
        System.out.printf("Loai: %s", Character.isDigit(c) ? "La chu so" : Character.isLetter(c) ? "Chu cai thuong" : "Ky tu dac biet");
    }
}
