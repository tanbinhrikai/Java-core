package bai5;

import java.util.Scanner;

public class Main {
    static void main() {
        Scanner scanner  = new Scanner(System.in);
        System.out.println("nhập n: ");
        int n = scanner.nextInt();

        tamGiac(n);

        System.out.println();
        tamGiacNguoc(n);
    }

    public static void tamGiac(int n){
        for(int i = 1 ; i<=n ;i++){
            for (int j = 1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println("");
        }

    }

    public static void tamGiacNguoc(int n){
        for(int i = 1 ; i<=n ;i++){
            for (int j = 1;j<=n-i+1;j++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
