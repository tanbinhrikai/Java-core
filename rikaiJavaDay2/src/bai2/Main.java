package bai2;

import java.util.Map;
import java.util.Scanner;

public class Main {
    private Map<Integer,String> dayInWeek = Map.of(
            1,"thứ hai",
            2,"thứ ba",
            3,"thứ tư",
            4,"thứ năm",
            5,"thứ sáu",
            6,"thứ bảy",
            7,"chủ nhật"

    );


    public void main(){
        String result="";
        Scanner scanner  = new Scanner(System.in);
        System.out.println("nhap so :");
        int dayNumber = scanner.nextInt();
        switch (dayNumber){
            case 1: {
                result = dayInWeek.get(1);
                break;
            }
            case 2: {
                result = dayInWeek.get(2);
                break;
            }
            case 3: {
                result = dayInWeek.get(3);
                break;
            }
            case 4: {
                result = dayInWeek.get(4);
                break;
            }
            case 5: {
                result = dayInWeek.get(5);
                break;
            }
            case 6: {
                result = dayInWeek.get(6);
                break;
            }
            case 7: {
                result = dayInWeek.get(7);
                break;
            }
            default:{
                System.out.println("số bạn nhập khong hợp le!");
                break;
            }



        }
        System.out.printf("kết quả là :  %s",result);
    }

}
