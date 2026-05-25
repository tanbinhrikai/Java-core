package bai5;

import java.util.Scanner;

public class Main {
    public void main(){
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập nhiệt độ: ");
        int nhietdo = sc.nextInt();
        double F =  nhietdo * 9/5 + 32;
        System.out.printf("nhiệt độ : %d",nhietdo);
        System.out.println("đơn vị C/F : C");
        System.out.printf("%dC = %f",nhietdo,F);
    }
}
