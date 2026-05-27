package bai10;

import java.util.Scanner;

public class Main {
    static void main() {
        System.out.println("nhap n ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(dequygiaithua(n));

        System.out.println(fib(n));


    }

    static int dequygiaithua(int n){
        if(n==1){
            return  1;
        }
        return n*dequygiaithua(n-1);
    }


    static int fib(int n){

        if(n <= 1){
            return n;
        }

        return fib(n - 1) + fib(n - 2);
    }
}
