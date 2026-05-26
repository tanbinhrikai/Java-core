package bai7;

import java.util.Scanner;

public class Main {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập n: ");
        int n = scanner.nextInt();
        int count = 0;
        int truoc = 0;
        int sau = 1;
        while (count<n){
            System.out.printf(truoc + " ");
            int tam = sau;
            sau = truoc + sau;
            truoc = tam;
            count ++;

        }
    }
}
