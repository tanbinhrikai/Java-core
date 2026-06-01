package day3.bai14;

public class Main {
    static void main() {
        String input = "  Hello   World   Java  ".trim();
        String[] words = input.split("\\s+");

        for (int i = 0; i < words.length / 2; i++) {
            String temp = words[i];
            words[i] = words[words.length - i - 1];
            words[words.length - i - 1] = temp;
        }

        System.out.println(String.join(" ", words).trim());

    }
}
