package bai17;

import java.util.Scanner;

public class Main {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap  n ");
        int n = scanner.nextInt();


        boolean[] check = new boolean[n+1];
        for(int i=2;i<=n;i++){
            if(!check[i]){
                // chungs to la so nguyen to
                for(int j = i*2;j<=n;j=j+i){
                    check[j] = true;
                }
                System.out.println(i+ " ");
            }
        }
    }
}
