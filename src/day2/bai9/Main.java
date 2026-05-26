package day2.bai9;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    static void main() {
        ArrayList<Double> scores = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        double score = 0;
        int choice = 0;
        do {
            System.out.printf("=== QUAN LY DIEM === %n 1. Nhap diem 2. Xem thong ke 0. Thoat %n");
            System.out.println("Chon: ");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Nhap diem: ");
                    score = scanner.nextDouble();
                    scores.add(score);
                    System.out.printf("Da them diem %f %n", score);
                    break;
                case 2:
                    Collections.sort(scores);
                    double sum = 0;
                    for (Double aDouble : scores) {
                        sum += aDouble;
                    }
                    double avgSum = sum / (scores.size());
                    System.out.printf("Cao nhat: %f | Thap nhat: %f | TB: %f %n", scores.get(scores.size() - 1), scores.get(0), avgSum);
                    break;
                default:
                    System.out.println("Bye");
                    return;
            }


        } while(score != 0);
    }
}
