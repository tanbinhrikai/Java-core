package day5.bai12;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<SinhVien> danhSach = new ArrayList<>();
        danhSach.add(new SinhVien("Chi", 9.0, 19));
        danhSach.add(new SinhVien("An", 8.5, 20));
        danhSach.add(new SinhVien("Binh", 6.0, 22));
        danhSach.add(new SinhVien("Dung", 7.5, 19));

        KiemTra<SinhVien> gioi = sv -> sv.getDiem() >= 8.0;
        KiemTra<SinhVien> tre = sv -> sv.getTuoi() < 21;
        KiemTra<SinhVien> gioi_va_tre = gioi.and(tre);

        locDanhSach(danhSach, gioi_va_tre);

    }

    static void locDanhSach(List<SinhVien> list, KiemTra<SinhVien> dieuKien) {
        for(SinhVien sv : list) {
            if(dieuKien.test(sv)) {
                System.out.println(sv);
            }
        }
    }
}
