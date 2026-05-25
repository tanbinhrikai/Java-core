package bai3;

import java.util.Scanner;

public class Main {
    public void main(){
        Scanner sc =  new Scanner(System.in);
        System.out.println("nhập bán kình :");
        double r = sc.nextDouble();

        double dientich = Math.PI * Math.pow(r, 2);
        double chuvi = 2 * Math.PI * r;

        System.out.printf("Diện tích: %.2f%n", dientich);
        System.out.printf("Chu vi: %.2f%n", chuvi);

        sc.close();
    }
}





