package bai13;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    static void main() {
        Scanner scanner  = new Scanner(System.in);
        System.out.println("nhap chuoi ");
        String input = scanner.nextLine();
        String[] mang = input.split("\\s+");


        int sotu = mang.length;

        // tìm từ dài nhất và ngắn nhất

        String minWord  = mang[0];
        String maxWord = mang[0];
        for(int i= 1;i< mang.length ;i++){
            if(mang[i].length() > maxWord.length()){
                maxWord = mang[i];
            }
            if(mang[i].length()< minWord.length()){
                minWord = mang[i];
            }
        }


        // đếm tần suất
        Map<String,Integer> tanSuat = new HashMap<>();
        for(int i=0;i<mang.length;i++){
            String word = mang[i];
            if(!tanSuat.containsKey(word)){
                tanSuat.put(word,1);
            }else {
                tanSuat.put(word,tanSuat.get(word)+1);
            }

        }

        System.out.println("tan suat ");
        tanSuat.forEach((s, value) -> {
            System.out.println(s + " " +  value + " lan");
        });

        System.out.println("ngan nhat va dai nhat lan luot la " + minWord + " " +  maxWord);

        System.out.println("so tu la : " + sotu);
    }
}
