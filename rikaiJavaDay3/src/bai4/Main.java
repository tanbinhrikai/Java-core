package bai4;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int[] numbers = {2, 5, 8, 12, 16, 23, 38, 56, 72, 91};

        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số cần tìm: ");
        int target = scanner.nextInt();

        int index = binarySearch(numbers, target);

        if (index == -1) {
            System.out.println("Không tìm thấy");
        } else {
            System.out.println("Tìm thấy tại index: " + index);
        }

        scanner.close();
    }

    static int binarySearch(int[] arr, int target) {

        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {

            int mid = left + (right - left) / 2;

            if (arr[mid] < target) {
                left = mid + 1;
            } else if (arr[mid] > target) {
                right = mid - 1;
            } else {
                return mid;
            }
        }

        return -1;
    }

    static int binarySearchRecursive(int[] arr, int target, int left, int right) {

        if (left > right) return -1;

        int mid = left + (right - left) / 2;

        if (arr[mid] < target) {
            return binarySearchRecursive(arr, target, mid + 1, right);
        }

        if (arr[mid] > target) {
            return binarySearchRecursive(arr, target, left, mid - 1);
        }

        return mid;
    }
}