package bai13;

import java.util.Scanner;

public class Main {
    public static void main() {

        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap ky tu: ");
        char ch = sc.next().charAt(0);

        int ascii = ch;

        char nextChar = (char) (ch + 1);

        System.out.println("Ma ASCII: " + ascii);
        System.out.println("Ky tu tiep: " + nextChar);

        if (Character.isLowerCase(ch)) {
            System.out.println("Chu hoa: " + Character.toUpperCase(ch));
        } else if (Character.isUpperCase(ch)) {
            System.out.println("Chu thuong: " + Character.toLowerCase(ch));
        }

        if (Character.isLetter(ch)) {

            if (Character.isLowerCase(ch)) {
                System.out.println("Loai: Chu cai thuong");
            } else {
                System.out.println("Loai: Chu cai hoa");
            }

        } else if (Character.isDigit(ch)) {

            System.out.println("Loai: Chu so");

        } else {

            System.out.println("Loai: Ky tu dac biet");
        }

        sc.close();
    }
}