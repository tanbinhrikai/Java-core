package bai3;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int[] numbers = {64, 34, 25, 12, 22, 11, 90};

        int[] javaSorted = numbers.clone();
        Arrays.sort(javaSorted);

        bubbleSortWithSteps(numbers);

        System.out.println("\nJava sort result:");
        System.out.println(Arrays.toString(javaSorted));
    }

    static void bubbleSortWithSteps(int[] arr) {

        int n = arr.length;

        for (int i = 0; i < n; i++) {

            boolean swapped = false;

            for (int j = 0; j < n - 1 - i; j++) {

                if (arr[j] > arr[j + 1]) {
                    swap(arr, j, j + 1);
                    swapped = true;
                }
            }

            System.out.print("Pass " + (i + 1) + ": ");
            System.out.println(Arrays.toString(arr));

            if (!swapped) break;
        }
    }

    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}