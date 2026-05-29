package bai14;

import bai13.SinhVien;

import java.util.Comparator;

public class Main {
    static void main() {
        Comparator<SinhVien>  comparator = new Comparator<SinhVien>() {
            @Override
            public int compare(SinhVien o1, SinhVien o2) {
                return Double.compare(o1.getDiem(),o2.getDiem());
            }
        };



        Comparator<SinhVien> comparatorLambda  = (a,b)-> Double.compare(
                a.getDiem(),b.getDiem()
        );

        Comparator<SinhVien>  comparatorRef  = Comparator.comparingDouble(SinhVien::getDiem).reversed();

    }


}
