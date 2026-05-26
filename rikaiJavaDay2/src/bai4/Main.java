package bai4;

import java.util.Scanner;

public class Main {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập lần lượt ba số a b c" );
        int a =  scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int max;
        if(a > b && a > c){
            max = a;
        }else if (b > a && b > c){
            max = b;
        }else {
            max = c;
        }
        System.out.printf("số lớn nhất là %d ",max);
    }
}
