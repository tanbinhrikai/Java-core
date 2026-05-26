package day2.bai1;

import java.util.Scanner;

public class Main {
    static void main() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhap diem: ");
        double score = scanner.nextDouble();
        if(score >= 9 && score <= 10) {
            System.out.println("Xuất xắc");
        }
        else if(score >= 8 && score < 9) {
            System.out.println("Gioi");
        }
        else if(score >= 6.5 && score < 8) {
            System.out.println("Kha");
        }
        else if(score >= 5 && score < 6.5) {
            System.out.println("Trung binh");
        }
        else if(score < 5) {
            System.out.println("Yeu/kem");
        }
    }
}
