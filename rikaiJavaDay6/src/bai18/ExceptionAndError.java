package bai18;

import java.io.FileReader;
import java.io.IOException;
import java.util.Optional;

public class ExceptionAndError {

    static void infinite() {
        infinite();
    }

    static void readFile() throws IOException {
        FileReader f = new FileReader("a.txt");
    }

    static int divide(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Không chia cho 0");
        }
        return a / b;
    }

    static Optional<Integer> find(int[] arr, int x) {
        for (int i : arr) {
            if (i == x) return Optional.of(i);
        }
        return Optional.empty();
    }

    public static void main(String[] args) {

        // 1. StackOverflowError
         infinite();

        // 2. OutOfMemoryError
         int[] arr = new int[Integer.MAX_VALUE];

        // 3. Catch Error
        try {
             int[] arrr = new int[Integer.MAX_VALUE];
        } catch (Error e) {
            System.out.println("Bắt Error: " + e);
        }


        // 4. Checked Exception
        try {
            readFile();
        } catch (IOException e) {
            System.out.println("Lỗi file: " + e.getMessage());
        }

        // 5. Unchecked Exception
        System.out.println(divide(10, 0));

        // Optional
        int[] nums = {1, 2, 3};

        Optional<Integer> result = find(nums, 5);
        System.out.println(result.orElse(-1));
    }
}