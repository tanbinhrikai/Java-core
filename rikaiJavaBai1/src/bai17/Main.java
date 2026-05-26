package bai17;

import java.util.Scanner;

public class Main {
    public void main(){
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập năm: ");
        int year = sc.nextInt();
        String resul = this.checkNamNhuan(year) ? "năm nhuận "  : "không nhuận";
        int numberDay = checkNamNhuan(year) ? 29 : 28;
        System.out.printf("năm %d -> %s , tháng 2 có %d ngày",year, resul,numberDay);
}

    private boolean checkNamNhuan(int year){
        return  year %400==0 || (year%4==0 && year%100!=0);
    }
}
