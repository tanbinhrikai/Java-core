package day6.bai3;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        HashSet<Integer> hashSet = new HashSet<>(List.of(1, 2, 3, 4, 5));
        TreeSet<Integer> treeSet = new TreeSet<>(List.of(3,4,5,6,7));

        hashSet.retainAll(treeSet);
        System.out.println(treeSet);

        hashSet.removeAll(treeSet);
        System.out.println(hashSet);

        hashSet.addAll(treeSet);
        System.out.println(hashSet);

        String s = "java is fun java is easy";
        String[] arr = s.split("\\s+");

        TreeSet<String> treeSetStr= new TreeSet<>(Arrays.stream(arr).toList());
        System.out.println(treeSetStr);

    }
}
