package day4.bai3;

public class Main {
    static void main() {
        TaiKhoanNganHang acc1 = new TaiKhoanNganHang(TaiKhoanNganHang.taoSoTK(), "Nguyen An", 5000000, 0.5);
        System.out.println(acc1);

        acc1.napTien(2000000);
        acc1.rutTien(8000000);
        acc1.tinhLaiHangThang();

        TaiKhoanNganHang acc2 = new TaiKhoanNganHang(TaiKhoanNganHang.taoSoTK(), "Nguyen Duy", 900000, 0.1);
        System.out.println(acc2);

        acc2.napTien(100000);
        acc2.rutTien(400000);
        acc2.tinhLaiHangThang();

    }
}
