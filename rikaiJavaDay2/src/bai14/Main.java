package bai14;

import java.util.Scanner;

public class Main {
    static void main() {
        System.out.println("trò chơi đoán số: ");
        System.out.println("bạn có 7 lượt đoán :");
        int random = (int) Math.random() * 100 + 1;
        Scanner scanner = new Scanner(System.in);
        for (int i =1; i<=7;i++){
            System.out.println("đoán : ");
            int doan = scanner.nextInt();
            if(doan == random){
                System.out.println("chính xác ");
                break;
            }
            if (doan > random){
                System.out.println("qua cao");
                continue;
            }else {
                System.out.println("qua thap");
            }

        }
    }
}
