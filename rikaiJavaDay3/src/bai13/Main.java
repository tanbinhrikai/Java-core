package bai13;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter string: ");
        String input = scanner.nextLine();

        String[] words = input.trim().split("\\s+");

        int wordCount = words.length;

        String shortest = words[0];
        String longest = words[0];

        Map<String, Integer> frequency = new HashMap<>();

        for (String word : words) {

            if (word.length() < shortest.length()) {
                shortest = word;
            }

            if (word.length() > longest.length()) {
                longest = word;
            }

            frequency.put(word, frequency.getOrDefault(word, 0) + 1);
        }

        System.out.println("\nFrequency:");
        frequency.forEach((key, value) ->
                System.out.println(key + " -> " + value + " times")
        );

        System.out.println("\nShortest word: " + shortest);
        System.out.println("Longest word: " + longest);
        System.out.println("Total words: " + wordCount);

        scanner.close();
    }
}