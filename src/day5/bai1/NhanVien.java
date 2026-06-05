package day5.bai1;

public class NhanVien {
    String ten;
    int luongCoBan;
    String phongBan;

    public NhanVien(String ten, int luongCoBan, String phongBan) {
        this.ten = ten;
        this.luongCoBan = luongCoBan;
        this.phongBan = phongBan;
    }

    public NhanVien(String ten, String phongBan) {
        this.ten = ten;
        this.phongBan = phongBan;
    }
}
