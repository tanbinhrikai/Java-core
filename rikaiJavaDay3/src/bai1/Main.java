package bai1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập số phần tử: ");
        int n = scanner.nextInt();

        int[] numbers = new int[n];

        int sum = 0;
        int even = 0;
        int odd = 0;
        int negative = 0;
        int positive = 0;
        int zero = 0;

        for (int i = 0; i < n; i++) {
            System.out.print("Nhập phần tử thứ " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();

            int x = numbers[i];
            sum += x;

            if (x == 0) zero++;
            else if (x > 0) positive++;
            else negative++;

            if (x % 2 == 0) even++;
            else odd++;
        }

        int min = numbers[0];
        int max = numbers[0];

        for (int i = 1; i < n; i++) {
            if (numbers[i] < min) min = numbers[i];
            if (numbers[i] > max) max = numbers[i];
        }

        double avg = (double) sum / n;

        System.out.println("Sum: " + sum);
        System.out.println("Average: " + avg);
        System.out.println("Min: " + min);
        System.out.println("Max: " + max);
        System.out.println("Even: " + even);
        System.out.println("Odd: " + odd);
        System.out.println("Negative: " + negative);
        System.out.println("Positive: " + positive);
        System.out.println("Zero: " + zero);

        scanner.close();
    }
}