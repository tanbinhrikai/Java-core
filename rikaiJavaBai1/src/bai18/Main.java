package bai18;

import java.util.Scanner;

public class Main {
    public void main(){
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập số tiền gốc : ");
        long tienGoc =  sc.nextLong();
        System.out.println("nhập lãi suất năm :");
        double laiSuat = sc.nextDouble();
        System.out.println("nhập số kì : ");
        int soKy = sc.nextInt();
        double laiDon = tienGoc*laiSuat*soKy/100;
        double laiKep = tienGoc * Math.pow(1+laiSuat/100,soKy)-tienGoc;
        System.out.printf("Lãi đơn = %,.0f\n", laiDon);
        System.out.printf("Tổng tiền lãi kép = %,.0f\n", laiKep);

    }
}
