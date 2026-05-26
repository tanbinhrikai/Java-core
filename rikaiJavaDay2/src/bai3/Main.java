package bai3;

import java.util.Scanner;

public class Main {
        private boolean isLeapYear(int year){
            return  year%400 ==0 || (year%4==0 && year%100!=0);

        }
        public void main(){
            Scanner scanner = new Scanner(System.in);
            System.out.println("nhập năm : ");
            int year = scanner.nextInt();
            System.out.println("nhập tháng :");
            int month = scanner.nextInt();
            int numberDay = switch (month){
                case 2 -> isLeapYear(year) ? 29 : 28;
                case 4,6,9,11 -> 30;
                default -> 31;
            };

            System.out.printf("tháng %d , năm %d có %d ngày ",month,year,numberDay);
        }
}
