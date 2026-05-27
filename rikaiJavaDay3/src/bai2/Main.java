package bai2;

import java.util.Scanner;

public class Main {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap so ptu ");
        int n = scanner.nextInt();
        int[] numbers = new int[n];
        for(int i=0;i<n;i++){
            System.out.println("ptu thứ " + (i+1));
            numbers[i] = scanner.nextInt();
        }


        mangPhu(numbers,n);

        hoandoi(numbers,n);

        for (int i=0;i<n;i++){
            System.out.println(numbers[i]);
        }



    }

    static void  mangPhu(int[] numbers,int n){
        int[] mangPhu = new int[n];
        for(int i = 0; i<n;i++){
            mangPhu[i] = numbers[n-i-1];
        }

        for (int i=0;i<n;i++){
            System.out.println(mangPhu[i]);
        }

    }


    static void  hoandoi(int[] numbers , int n){
        for (int i=0;i<n/2;i++){
            int tam = numbers[n-i-1];
            numbers[n-i-1] = numbers[i];
            numbers[i]=tam;
        }

    }
}
