package bai18;

import java.util.Scanner;

public class Main {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap so n ");
        int n = scanner.nextInt();
        int snapshor_n = n;
        int result = 0;
        boolean isNegative = n < 0;

        if (isNegative) {
            n = -n;
        }

        while(n>0){
            result = result*10 + n%10;
            n =n/10;
        }
        if(isNegative){
            result = -result;
        }
        System.out.println(result);


        boolean palindrome = result == snapshor_n;
        System.out.printf("tính palindrome : %b ",palindrome);
    }
}
