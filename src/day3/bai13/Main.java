package day3.bai13;

import java.util.HashMap;
import java.util.Map;

public class Main {
    static void main() {
        String input = "java is fun java is easy";

        String[] arr = input.split("\\s+");

        int maxLength = 0;
        int minLength = 0;
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if(arr[i].length() >= maxLength) {
                maxLength = arr[i].length();
            }
            else {
                minLength = arr[i].length();
            }
            if(map.containsKey(arr[i])) {
                map.put(arr[i], map.get(arr[i]) + 1);
            }
            else {
                map.put(arr[i], 1);
            }
        }

        System.out.printf("So tu: %d (unique: %d)", arr.length, map.size());

        System.out.println("");
        System.out.print("Dai nhat: ");
        int finalMaxLength = maxLength;
        map.forEach((key, value) -> {
            if(key.length() == finalMaxLength) {
                System.out.printf("%s ", key);
            }
        });

        System.out.println("");
        System.out.print("Ngan nhat: ");
        int finalMinLength = minLength;
        map.forEach((key, value) -> {
            if(key.length() == finalMinLength) {
                System.out.printf("%s ", key);
            }
        });

        System.out.println("");
        System.out.print("Tan suat: ");
        map.forEach((key, value) -> {
            System.out.printf("%s = %d ", key, value);
        });
    }
}
