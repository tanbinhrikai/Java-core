package bai1;

public class NhanVienPartTime extends NhanVien {
    private int soGio;
    private int gioGia;


    public NhanVienPartTime(String name, int luongCoBan, String phongBan,int soGio,int gioGia) {
        super(name, luongCoBan, phongBan);
        this.soGio = soGio;
        this.gioGia = gioGia;
    }

    @Override
    public int tinhLuong() {
        return this.soGio * this.gioGia;
    }
}
