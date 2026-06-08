package bai5;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        int[] numbers = {1, 3, 1, 5, 3, 7, 5, 9};

        List<Integer> unique = removeDuplicates(numbers);

        System.out.println(unique);
    }

    static List<Integer> removeDuplicates(int[] arr) {

        List<Integer> result = new ArrayList<>();

        for (int x : arr) {
            if (!result.contains(x)) {
                result.add(x);
            }
        }

        return result;
    }
}