package bai3;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {

        Set<Integer> set1 = generateRandomSet(20);
        Set<Integer> set2 = generateRandomSet(20);

        System.out.println("Set1: " + set1);
        System.out.println("Set2: " + set2);

        Set<Integer> union = new HashSet<>(set1);
        union.addAll(set2);

        Set<Integer> intersection = new HashSet<>(set1);
        intersection.retainAll(set2);

        Set<Integer> difference = new HashSet<>(set1);
        difference.removeAll(set2);

        System.out.println("\nUnion:");
        System.out.println(union);

        System.out.println("\nIntersection:");
        System.out.println(intersection);

        System.out.println("\nDifference (set1 - set2):");
        System.out.println(difference);

        printUniqueWords();
    }

    private static Set<Integer> generateRandomSet(int size) {

        Set<Integer> result = new HashSet<>();

        for (int i = 0; i < size; i++) {
            result.add((int) (Math.random() * 100));
        }

        return result;
    }

    private static void printUniqueWords() {

        String sentence = "java is fun java is easy";

        Set<String> uniqueWords = new TreeSet<>();

        for (String word : sentence.split(" ")) {
            uniqueWords.add(word);
        }

        System.out.println("\nUnique words (sorted):");
        System.out.println(uniqueWords);
    }
}