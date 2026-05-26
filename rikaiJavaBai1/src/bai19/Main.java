package bai19;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String input;

        do {
            System.out.print("Nhap bieu thuc: ");
            input = sc.nextLine();

            if (input.equalsIgnoreCase("exit")) {
                System.out.println("Tam biet!");
                break;
            }

            String[] parts = input.split(" ");

            if (parts.length != 3) {
                System.out.println("Loi: Nhap sai dinh dang!");
                continue;
            }

            try {
                double a = Double.parseDouble(parts[0]);
                String op = parts[1];
                double b = Double.parseDouble(parts[2]);

                double result;

                switch (op) {

                    case "+":
                        result = a + b;
                        break;

                    case "-":
                        result = a - b;
                        break;

                    case "*":
                        result = a * b;
                        break;

                    case "/":
                        if (b == 0) {
                            System.out.println("Loi: Khong the chia cho 0!");
                            continue;
                        }
                        result = a / b;
                        break;

                    case "%":
                        if (b == 0) {
                            System.out.println("Loi: Khong the chia cho 0!");
                            continue;
                        }
                        result = a % b;
                        break;

                    case "^":
                        result = Math.pow(a, b);
                        break;

                    default:
                        System.out.println("Loi: Toan tu khong hop le!");
                        continue;
                }

                System.out.println(
                        "Ket qua: " + a + " " + op + " " + b + " = " + result
                );

            } catch (NumberFormatException e) {
                System.out.println("Loi: Vui long nhap dung dinh dang so!");
            }

        } while (true);

        sc.close();
    }
}