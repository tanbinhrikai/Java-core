package bai15;

import java.util.Scanner;

public class Main {
    public void main(){
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập số giây: ");
        long second =  sc.nextLong();
        long hour = second/3600;
        int minutes = (int) second%3600/60;
        int sec = (int) second%60;
        System.out.printf("%02d:%02d:%02d", hour, minutes, sec);


    }
}
