package bai4;

import java.util.Scanner;

public class Main {
    static void main() {
        int[] numbers = {2, 5, 8, 12, 16, 23, 38, 56, 72, 91};
        int left =  0 ;
        int right = numbers.length -1;
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap so can tim ");
        int n = scanner.nextInt();
        int count = 0;
        int index=-1;
        
        
        while (left <= right){
            count++;
            int mid = (left + right)/2;
            
            if(numbers[mid]< n){
                left = mid+1;
            } else if (numbers[mid] > n) {
                right = mid -1;
            }else {
                index = mid;
                break;
            }
        }
        if(index==-1){
            System.out.println("khong tim thay");
        }else {
            System.out.println("timf thay tai " + index);
        }



    }


    static int  dequy(int[] numbers , int n,int left, int right){
        if(left>right) {
            return -1;
        }
            int mid  =(left + right)/2;
            if(numbers[mid]< n){
                left = mid+1;
                return dequy(numbers,n,left,right);
            } else if (numbers[mid] > n) {
                right = mid -1;
                return dequy(numbers,n,left,right);
            }else {
               return  mid;
            }

    }
}
