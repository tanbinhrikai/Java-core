package day5.bai13;

public class DonHang {
    double gia;
    ChienLuocGia chienLuocGia;

    public DonHang(double gia) {
        this.gia = gia;
    }

    public DonHang(double gia, ChienLuocGia chienLuocGia) {
        this.gia = gia;
        this.chienLuocGia = chienLuocGia;
    }

    public DonHang setChienLuocGia(ChienLuocGia chienLuocGia) {
        this.chienLuocGia = chienLuocGia;
        return this;
    }

    public double tinhTong() {
        return chienLuocGia.tinhGia(gia);
    }
}
