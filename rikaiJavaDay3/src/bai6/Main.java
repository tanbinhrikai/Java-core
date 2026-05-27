package bai6;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static void main() {
        int[]numbers = {1,2,3,4,5};
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap so buoc nhay ");
        int   k = scanner.nextInt();
        int[] mangPhu = new int[numbers.length];
        for(int i=0;i<numbers.length;i++){
            int newIndex = (i+k)%numbers.length;
            mangPhu[newIndex] = numbers[i];
        }
        System.out.println(Arrays.toString(mangPhu));




        // cach 2 : dao nguoc 3 lan

        rotate(numbers,k);

        System.out.println(Arrays.toString(numbers));



    }

    static  void reverse(int[] arr, int left, int right){
        while (left<right){
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }

    static void  rotate(int[]arr,int k){
        int length = arr.length;
        reverse(arr,0,length-1);
        reverse(arr, 0, k - 1);
        reverse(arr, k, length - 1);
    }
}
