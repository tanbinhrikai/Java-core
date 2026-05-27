package day3.bai2;

public class Main {
    static void main() {
        int[] arr = {1, 2, 3, 4, 5};

        int[] newArr = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            newArr[i] = arr[arr.length - i - 1];
        }

        for (int i = 0; i < arr.length / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = temp;
        }

        System.out.print("Mang phu: ");
        for (int x : newArr) {
            System.out.printf("%d ", x);
        }
        System.out.println("");

        System.out.print("in-place: ");
        for (int x : arr) {
            System.out.printf("%d ", x);
        }
    }
}
