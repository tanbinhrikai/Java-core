package bai15;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhap chuoi ky tu:");
        String input = scanner.nextLine();

        int nguyenam = 0;
        int phuam = 0;
        int khoangtrang = 0;
        int chuso = 0;
        int kytudb = 0;

        for (char c : input.toCharArray()) {

            if (Character.isDigit(c)) {
                chuso++;
            }

            else if (Character.isWhitespace(c)) {
                khoangtrang++;
            }

            else if (Character.isLetter(c)) {

                if ("aeiouAEIOU".indexOf(c) != -1) {
                    nguyenam++;
                } else {
                    phuam++;
                }
            }

            else {
                kytudb++;
            }
        }

        System.out.println("Nguyen am: " + nguyenam);
        System.out.println("Phu am: " + phuam);
        System.out.println("Khoang trang: " + khoangtrang);
        System.out.println("Chu so: " + chuso);
        System.out.println("Ky tu dac biet: " + kytudb);

        scanner.close();
    }
}