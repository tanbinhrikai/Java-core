package bai1;

import java.util.Scanner;

public class Main {
    static void main() {
        Scanner scanner  = new Scanner(System.in);
        System.out.println("nhập n  phan tư : ");
        int n  = scanner.nextInt();

        int[] numbers = new int[n];
        int sum = 0;
        int chan=0;
        int le=0;
        int am = 0;
        int duong=0;
        int zero = 0;


        for(int i = 1;i<=n;i++){
            System.out.println("nhập phần tử thứ " + i);
            numbers[i-1] = scanner.nextInt();
            sum+=numbers[i-1];

            if(numbers[i-1] ==0){
                zero++;
            }
            if (numbers[i-1]<0) {
                am++;

            }
            if (numbers[i-1]>0) {
                duong++;

            }
            if(numbers[i-1]%2==0){
                chan++;
            }else {
                le++;
            }

        }
        double tb =(double) sum/n;
        int min = numbers[0];
        int max = numbers[0];

        for(int i=1;i<n;i++){
            if(numbers[i] < min){
                min = numbers[i];
            }

            if(numbers[i] > max){
                max = numbers[i];
            }
        }
        System.out.println("tong : " + sum );
        System.out.println("trung binh: "+ tb);
        System.out.println("min : "+ min);
        System.out.println("max: "+ max);
        System.out.println("chan :" + chan);
        System.out.println("le :"+ le);
        System.out.println("am :"+ am);
        System.out.println("duong:  "+duong);





    }

}
