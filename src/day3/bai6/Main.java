package day3.bai6;

public class Main {
    static void main() {
//        int[] arr = {1,2,3,4,5};
        int[] arr = {12, -5, 0, 99, 7};
        int k = 3;
        int[] result = new int[arr.length];

        for(int i = 0; i < arr.length; i++) {
            int newIndex = (i + k) % arr.length;
            result[newIndex] = arr[i];
        }

        System.out.println("Cach 1: ");
        for(int x : result) {
            System.out.printf("%d ", x);
        }

        for(int i = 0; i < k; i++) {
            int temp = arr[i];
            arr[i] = arr[k - i - 1];
            arr[k - i - 1] = temp;
        }

        for(int i = k; i < arr.length; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = temp;
        }

        for (int i = 0; i < arr.length; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = temp;
        }

        System.out.println("");
        System.out.println("Cach 2: ");
        for(int x : result) {
            System.out.printf("%d ", x);
        }

    }
}
