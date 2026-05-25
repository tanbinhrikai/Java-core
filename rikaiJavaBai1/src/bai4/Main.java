package bai4;

import java.util.Scanner;

public class Main {
    public void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Cân nặng (kg) :");
        double cannang = sc.nextDouble();
        System.out.println("chiều cao (m) :");
        double chieucao = sc.nextDouble();
        double BMI = cannang/chieucao*chieucao;
        String result ;
        if(BMI<18.5){
            result = "gầy";
        } else if (BMI >=18.5 && BMI <25) {
            result = "bình thường";
            
        } else if (BMI>=25 && BMI <30) {
            result = "thừa cân";
            
        }else {
            result = "béo phì";
        }

        System.out.printf("BMI: %f - %s",BMI,result);
    }
}
