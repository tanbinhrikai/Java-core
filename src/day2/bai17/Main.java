package day2.bai17;

import java.util.Scanner;

public class Main {
    static boolean isPerfectNumber(int n) {
        int sum = 0;
        for(int i = 1; i < n; i++) {
            if(n % i == 0)
                sum += i;
        }
        if(sum == n)
            return true;
        return false;
    }
    static void main() {
        System.out.println("So hoan hao < 10000: ");
        for(int i = 1; i < 10000; i++) {
            if(isPerfectNumber(i))
                System.out.print(i + " ");
        }
    }
}
