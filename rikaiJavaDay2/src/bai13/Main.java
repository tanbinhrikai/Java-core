package bai13;

import java.util.Scanner;

public class Main {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập vào số nguyên n");
        int n = scanner.nextInt();
        int count =0,total = 0;
        while (n!=0){
            count ++;
            total = total + n%10;
            n/=10;
        }
        System.out.printf("số chữ số và tổng là %d , %d ", count, total);

    }
}
