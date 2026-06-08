package bai6;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int[] numbers = {1, 2, 3, 4, 5};

        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số bước xoay k: ");
        int k = scanner.nextInt();

        k = k % numbers.length;

        int[] rotated = rotateWithExtraArray(numbers, k);
        System.out.println("Rotate (extra array): " + Arrays.toString(rotated));

        int[] copy = numbers.clone();
        rotateInPlace(copy, k);
        System.out.println("Rotate (in-place): " + Arrays.toString(copy));

        scanner.close();
    }

    static int[] rotateWithExtraArray(int[] arr, int k) {

        int n = arr.length;
        int[] result = new int[n];

        for (int i = 0; i < n; i++) {
            int newIndex = (i + k) % n;
            result[newIndex] = arr[i];
        }

        return result;
    }

    static void rotateInPlace(int[] arr, int k) {

        int n = arr.length;

        reverse(arr, 0, n - 1);
        reverse(arr, 0, k - 1);
        reverse(arr, k, n - 1);
    }

    static void reverse(int[] arr, int left, int right) {

        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }
    }
}