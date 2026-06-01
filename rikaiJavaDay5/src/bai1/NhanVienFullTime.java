package bai1;

public class NhanVienFullTime extends NhanVien{
    private int thuong;
    public NhanVienFullTime(String name, int luongCoBan, String phongBan,int thuong) {
        super(name, luongCoBan, phongBan);
        this.thuong = thuong;
    }
    public int tinhLuong() {
        return  this.thuong + super.getLuongCoBan();
    }
}
