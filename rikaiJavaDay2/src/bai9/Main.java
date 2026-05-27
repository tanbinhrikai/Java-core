package bai9;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        int choose;
        List<Double> diem = new ArrayList<>();
        do {
            System.out.println("quan ly diem :");
            System.out.println("1.nhap diem ");
            System.out.println("2.xem thong ke");
            System.out.println("3.tinh diem tb");
            System.out.println("0.thoat");

            System.out.println("nhap lua chon");

            choose = scanner.nextInt();
            switch (choose){
                case 1 : {
                    System.out.println("nhap : ");
                    double diemnhap = scanner.nextDouble();
                    diem.add(diemnhap);
                    break;
                }
                case 2 :{
                    double max = Collections.max(diem);
                    double min = Collections.min(diem);
                    System.out.println("cao nhat : "+ max);
                    System.out.println("thap nhap : "+ min);
                }
                case 3:{
                    double agv = diem.stream().mapToDouble(value -> value)
                            .average()
                            .orElse(0);
                    System.out.println("diem tb : "+ agv);
                }

            }


        } while (choose!=0);
    }
}
