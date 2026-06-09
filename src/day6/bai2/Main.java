package day6.bai2;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Main {
    static Map<String, Map<String, Double>> sinhViens = new HashMap<>();

    static void addDiem(String tenSv, String monHoc, double score) {
        sinhViens.computeIfAbsent(tenSv, k -> new HashMap<>()).put(monHoc, score);
    }

    static double diemTB(String tenSinhVien) {
        Map<String, Double> diem = sinhViens.get(tenSinhVien);
        double sum = 0;
        for(double x : diem.values()) {
            sum += x;
        }
        return sum / diem.size();
    }

    static void getSvMaxScoreByTenMonHoc(String tenMonHoc) {

        double maxScoreOfTenMonHoc = 0;

        for(var i : sinhViens.values()) {
            if(i.get(tenMonHoc) != null)
                maxScoreOfTenMonHoc = Math.max(i.get(tenMonHoc), maxScoreOfTenMonHoc);
        }

        double finalMaxScoreOfTenMonHoc = maxScoreOfTenMonHoc;
        sinhViens.forEach((k, v) -> {
            if(v.get(tenMonHoc) != null && v.get(tenMonHoc).compareTo(finalMaxScoreOfTenMonHoc) == 0) {
                System.out.printf("Top %s: %s(%.2f)", tenMonHoc,  k, v.get(tenMonHoc));
                return;
            }
        });


    }


    static void in() {
        sinhViens.forEach((k, v) -> {
            System.out.println(k + v);
        });
    }

    public static void main(String[] args) {
        addDiem("An", "Java", 9.0);
        addDiem("An", "C", 9.5);
        addDiem("An", "Python", 8.0);
        addDiem("Minh", "Java", 9.5);
        addDiem("Cong", "Java", 10);
        addDiem("Cong", "C", 9.7);


        System.out.println(diemTB("An"));
        getSvMaxScoreByTenMonHoc("Java");
        System.out.println("");
        System.out.println("======");
        in();
    }
}
