package bai14;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter sentence: ");
        String input = scanner.nextLine();

        String result = reverseWords(input);

        System.out.println(result);

        scanner.close();
    }

    static String reverseWords(String input) {

        String[] words = input.trim().split("\\s+");

        int left = 0;
        int right = words.length - 1;

        while (left < right) {

            String temp = words[left];
            words[left] = words[right];
            words[right] = temp;

            left++;
            right--;
        }

        return String.join(" ", words);
    }
}