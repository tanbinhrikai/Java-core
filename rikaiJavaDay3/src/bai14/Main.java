package bai14;

import java.util.Scanner;

public class Main {
    static void main() {
        Scanner scanner  = new Scanner(System.in);
        String input =  scanner.nextLine();

        String[] mang = input.split("\\s+");
        int left  = 0;
        int right = mang.length-1;
        while (left<right){
            String temp = mang[left];
            mang[left] = mang[right];
            mang[right] = temp;
            left++;
            right--;
        }

        String output  = String.join(" ",mang);
        System.out.println(output);

    }
}
