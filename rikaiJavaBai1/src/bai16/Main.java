package bai16;

import java.util.Scanner;

public class Main {
    public void main(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap so nguyen duong vao : ");
        int number = scanner.nextInt();
        System.out.printf("tổng của %d là %d ", number, deQuyTinhTong(number));

    }

    private int deQuyTinhTong(int number){
        if(number==0) return  0;
        return  number%10 + deQuyTinhTong(number/10);
    }

}
