package day4.bai14;

import day4.bai13.SinhVien;

import java.util.Comparator;

public class Main {
    static void main() {

        // Anonymous class
        Comparator<SinhVien> comp1 = new Comparator<SinhVien>() {
            @Override
            public int compare(SinhVien o1, SinhVien o2) {
                return Double.compare(o1.getScore(), o2.getScore());
            }
        };

        // Lambda
        Comparator<SinhVien> comp2 = (a,b) -> Double.compare(b.getAge(), a.getAge());

        // Method ref:
        Comparator<SinhVien> comp3 = Comparator.comparingDouble(SinhVien::getScore).reversed();



    }
}
