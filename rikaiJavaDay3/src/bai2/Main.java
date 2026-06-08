package bai2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập số phần tử: ");
        int n = scanner.nextInt();

        int[] numbers = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Phần tử thứ " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }

        printReverseArray(numbers);
        reverseInPlace(numbers);

        System.out.println("\n Mảng sau khi hoán đổi:");
        for (int x : numbers) {
            System.out.println(x);
        }

        scanner.close();
    }

    static void printReverseArray(int[] arr) {
        System.out.println("\nMảng đảo ngược (mảng phụ):");
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.println(arr[i]);
        }
    }

    static void reverseInPlace(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[n - i - 1];
            arr[n - i - 1] = temp;
        }
    }
}