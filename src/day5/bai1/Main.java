package day5.bai1;

public class Main {
    static void main() {
        NhanVienFullTime nhanVienFullTime = new NhanVienFullTime("An", 15000000,  2000000, "IT");
        System.out.printf("Tinh luong = %,d %n", nhanVienFullTime.tinhLuong());

        NhanVienPartTime nhanVienPartTime = new NhanVienPartTime("Bao","Marketing", 80, 100000 );
        System.out.printf("Tinh luong = %,d", nhanVienPartTime.tinhLuong());
    }
}
