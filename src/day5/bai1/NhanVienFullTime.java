package day5.bai1;

public class NhanVienFullTime extends NhanVien {
    int thuong;

    public NhanVienFullTime(String ten, int luongCoBan, int thuong, String phongBan) {
        super(ten, luongCoBan, phongBan);
        this.thuong = thuong;
    }

    public NhanVienFullTime(String ten, int luongCoBan, String phongBan) {
        super(ten, luongCoBan, phongBan);
    }

    public int tinhLuong() {
        return super.luongCoBan + thuong;
    }

}
