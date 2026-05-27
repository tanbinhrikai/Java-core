package day3.bai1;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhap so luong phan tu: ");
        int n = sc.nextInt();

        int[] nums = new int[n];
        int sum = 0;
        int min = 0;
        int max = 0;
        int countPositive = 0;
        int countNegative = 0;
        int countEven = 0 ;
        int countOdd = 0;
        int countZero = 0;

        System.out.printf("Nhap %d phan tu: ", n);
        for(int i = 0; i < n; i++) {
            int x = sc.nextInt();
            nums[i] = x;
            sum += x;
            if(i == 0) {
                min = nums[0];
                max = nums[0];
            }
            if(nums[i] > max) max = nums[i];
            if(nums[i] < min) min = nums[i];
            if(nums[i] > 0) countPositive++;
            else if(nums[i] < 0) countNegative++;
            if(nums[i] % 2 == 0) countEven++;
            else countOdd++;
            if(nums[i] == 0) countZero++;
        }
        System.out.printf("Tong = %d TB=%.2f Min=%d Max=%d %n", sum, sum / (double) n, min, max);
        System.out.printf("Chan = %d Le=%d Am=%d Duong=%d Bang0=%d %n", countEven, countOdd, countNegative, countPositive, countZero);

    }

}
