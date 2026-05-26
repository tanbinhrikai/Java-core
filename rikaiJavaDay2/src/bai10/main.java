package bai10;

import java.util.Scanner;

public class main {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập n số nguyên : ");
        int n = scanner.nextInt();
        int sum = 0;

        for(int i=1;i<=n;i++){
            int number  = scanner.nextInt();
            if(number ==0){
                break;
            }
            if(number<0){
                continue;
            }
            sum+=number;
        }

        System.out.printf("tổng các số dương là %d \n ",sum);
        System.out.println("các số chăn kh chia hết cho 4 :" );
        for(int i=1;i<=50;i++){
            if(check(i)){
                System.out.print(i + " ");
            }
        }


    }

    static boolean check(int number){
        return number%2==0 && number%4!=0;
    }
}
