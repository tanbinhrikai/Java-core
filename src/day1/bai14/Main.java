package day1.bai14;

import java.util.Scanner;

public class Main {
    static final double BHXH = 8;
    static final double BHYT = 1.5;
    static final double BHTN = 1;
    static final double THUE_TNCN = 10;


    static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Luong co ban: ");
        double salary = sc.nextDouble();

        double bhxh = salary * BHXH / 100;
        double bhyt = salary * BHYT / 100;
        double bhtn = salary * BHTN / 100;

        double thueCaNhan = 0;
        if(salary > 11000000) {
            thueCaNhan = (salary - 11000000) * THUE_TNCN / 100;
        }

        double finalSalary = salary - bhxh - bhyt - bhtn - thueCaNhan;

        System.out.printf("Luong co ban: %,.2f\n" +
                "BHXH (8%%): %,.2f\n" +
                "BHYT (1.5%%): %,.2f\n" +
                "BHTN (1%%): %,.2f\n" +
                "Thue TNCN: %,.2f\n" +
                "Luong thuc nhan: %,.2f",  salary, bhxh, bhyt, bhtn, thueCaNhan, finalSalary);



    }
}
