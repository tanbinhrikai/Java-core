package bai3;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Set<Integer> hashSet = new HashSet<Integer>();
        Set<Integer> treeSet = new TreeSet<Integer>();
        int n = 20 ;
        for (int i = 0; i < n; i++) {
            int number = (int) (Math.random() * 100 );
            hashSet.add(number);
            int random = (int) (Math.random() * 100 );
            treeSet.add(random);
        }


        Set<Integer> hashSetCoppy = new HashSet<>(hashSet);
        hashSetCoppy.retainAll(treeSet);


        System.out.println("phan tu chung ");

        for(Integer number : hashSetCoppy) {
            System.out.println(number);
        }


        System.out.println("chỉ có trong set 1");
        hashSet.removeAll(treeSet);

        for(Integer number : hashSet) {
            System.out.println(number);
        }




        // loại bỏ trùng từ câu văn

        String input = "java is fun java is easy";
        String[] words = input.split(" ");
        Set<String> wordSet = new TreeSet<>();
        for (String word : words) {
            wordSet.add(word);
        }

        for (String word : wordSet) {
            System.out.println(word);
        }

    }

}
