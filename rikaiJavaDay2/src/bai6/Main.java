package bai6;

import java.util.Scanner;

public class Main {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap so n :");
        int number = scanner.nextInt();
        String result  = isNguyenTo(number) ? "nguyen to" : "khong nguyen to";
        System.out.printf("%d : %s",number,result);


        int count = 0;
        System.out.println("\n số nguyên tố chạy từ 1 - 100 là : ");
        for(int i = 1; i<= 100; i++){
            if(isNguyenTo(i)){
                System.out.printf("%d ",i);
                count++;
            }
        }
        System.out.println("có tổng cộng " + count + " số nguyên tố");;
    }

    private static boolean isNguyenTo(int number){
        if(number < 2) return  false;
        for(int i = 2; i< number ; i++){
            if(number % i ==0){
                return  false;
            }
        }
        return  true;
    }
}
