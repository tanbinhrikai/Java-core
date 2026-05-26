package day2.bai5;

import java.util.Scanner;

public class Main {
    static void main() {
        Scanner sc =  new Scanner(System.in);
        System.out.println("In ngoi sao");
        int n = sc.nextInt();

        for (int i = n; i > 0; i--) {
            for(int j = n; j >= i; j--) {
                System.out.print("*");
            }
            System.out.println("");
        }
        System.out.println("-----");

        for (int i = 0; i < n; i++) {
            for(int j = i; j < n; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }

    }
}
