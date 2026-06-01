package bai12;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<SinhVien> list = new ArrayList<SinhVien>();
        SinhVien sv1 = new SinhVien(15,9);
        SinhVien sv2 = new SinhVien(15,2);
        SinhVien sv3 = new SinhVien(17,10);
        list.add(sv1);
        list.add(sv2);
        list.add(sv3);

        KiemTra<SinhVien> gioi = (sv)-> sv.getDiem()>8;
        KiemTra<SinhVien> tre = sv-> sv.getAge() < 20;

        KiemTra<SinhVien> gioi_tre = gioi.and(tre);

        List<SinhVien> result = list.stream().filter(sinhVien -> gioi_tre.test(sinhVien))
                .toList();
        for(SinhVien sv : result){
            System.out.println(sv.getDiem() + " " + sv.getAge());
        }



    }
}
