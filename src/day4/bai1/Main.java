package day4.bai1;

public class Main {
    static void main() {
        SinhVien sv1 = new SinhVien("SV001", "Nguyen An", 20, 8.5);
        SinhVien sv2 = new SinhVien("SV002", "Nguyen Binh", 25, 9);
        sv2.setAge(5);

        System.out.println(sv1);
        System.out.printf("SinhVien.getSoLuong() -> %d", SinhVien.count);
    }
}
