package day1.bai19;

import java.util.Scanner;

public class Main {
    static void main() {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("Nhap bieu thuc: ");
            String bieuThuc = sc.nextLine();
            String str[] = bieuThuc.split(" ");
            if(str.length == 3) {
                switch (str[1]) {
                    case "+" ->
                            System.out.printf("Ket qua: %s = %d %n", bieuThuc, Integer.parseInt(str[0]) + Integer.parseInt(str[2]));
                    case "-" ->
                            System.out.printf("Ket qua: %s = %d %n", bieuThuc, Integer.parseInt(str[0]) - Integer.parseInt(str[2]));
                    case "*" ->
                            System.out.printf("Ket qua: %s = %d %n", bieuThuc, Integer.parseInt(str[0]) * Integer.parseInt(str[2]));
                    case "/" -> {
                        try {
                            System.out.printf("Ket qua: %s = %d %n", bieuThuc, Integer.parseInt(str[0]) / Integer.parseInt(str[2]));
                        } catch (ArithmeticException e) {
                            System.out.println("Loi khong the chia cho 0!");
                        }
                    }
                    case "%" ->
                            System.out.printf("Ket qua: %s = %d %n", bieuThuc, Integer.parseInt(str[0]) % Integer.parseInt(str[2]));
                    case "^" ->
                            System.out.printf("Ket qua: %s = %f %n", bieuThuc, Math.pow(Integer.parseInt(str[0]), Integer.parseInt(str[2])));
                }
            }
            else {
                System.out.println("Tam Biet");
                break;
            }
        }

    }
}
