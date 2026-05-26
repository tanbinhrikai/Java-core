package day2.bai7;

import java.util.Scanner;

public class Main {
    static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhap so n: ");
        int n =  sc.nextInt();

        int a=0;
        int b=1;
        int i=2;
        while(i < n) {
            int temp = a + b;
            a = b;
            b = temp;
            if(i == 2) {
                System.out.printf("0 1 ");
            }
            System.out.printf("%d ", temp);
            i++;
        }

    }
}
