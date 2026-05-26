package bai12;

import java.util.Scanner;

public class Main {
    static void main() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("nhập hai số a và b : ");
        int a  = scanner.nextInt();
        int b = scanner.nextInt();
        while (b!=0){
            int tem = b;
            b = a%b;
            a = tem;
        }
        System.out.println(a);

        System.out.println(dequy(a,b));
    }


    static int dequy(int a, int b){
        if(a==0){
            return  b;
        }
        return dequy(b%a,a);
    }

}
