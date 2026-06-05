package day5.bai13;

public class Main {
    static void main() {
        DonHang donHang = new DonHang(500);
        System.out.println(donHang.setChienLuocGia(new GiaThanhVien()).tinhTong());
        System.out.println(donHang.setChienLuocGia(new GiaThong()).tinhTong());
        System.out.println(donHang.setChienLuocGia(new GiaVip()).tinhTong());
        System.out.println(donHang.setChienLuocGia(new GiaFlashSale()).tinhTong());

    }
}
