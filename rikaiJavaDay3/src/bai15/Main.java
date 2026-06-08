package bai15;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

        int[] numbers = {1, 3, 2, 1, 4, 1, 3, 3};

        Map<Integer, Integer> frequency = new HashMap<>();

        for (int x : numbers) {
            frequency.put(x, frequency.getOrDefault(x, 0) + 1);
        }

        int max = 0;

        for (int value : frequency.values()) {
            if (value > max) {
                max = value;
            }
        }

        System.out.println("Most frequent elements:");

        for (Map.Entry<Integer, Integer> entry : frequency.entrySet()) {
            if (entry.getValue() == max) {
                System.out.println(entry.getKey() + " appears " + entry.getValue() + " times");
            }
        }
    }
}