package bai17;

import java.util.Scanner;

public class Main {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập số n : ");
        int n = scanner.nextInt();
        System.out.printf("%d là số hoàn hảo : %b \n",n,check(n));


        for(int i=1;i<1000;i++){
            if(check(i)){
                System.out.printf(i + " ");
            }
        }


    }
    static boolean check(int number){
        int sum =  0;
        for(int i=1;i<=number/2; i++){
            if(number%i==0){
                sum+=i;
            }
        }
        return sum == number;
    }
}
