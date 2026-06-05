package day5.bai1;

public class NhanVienPartTime extends NhanVien{
    private int soGio;
    private int gioGia;

    public NhanVienPartTime(String ten, String phongBan, int soGio, int gioGia) {
        super(ten, phongBan);
        this.soGio = soGio;
        this.gioGia = gioGia;
    }

    public int tinhLuong() {
        return soGio * gioGia;
    }


}
