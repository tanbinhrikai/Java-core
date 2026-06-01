package bai13;

public class DonHang {
    private double giaGoc;

    public DonHang(double giaGoc, ChienLuocGia chienLuocGia) {
        this.giaGoc = giaGoc;
        this.chienLuocGia = chienLuocGia;
    }

    private ChienLuocGia chienLuocGia;

    public ChienLuocGia getChienLuocGia() {
        return chienLuocGia;
    }

    public void setChienLuocGia(ChienLuocGia chienLuocGia) {
        this.chienLuocGia = chienLuocGia;
    }

    public double tinhTong(){
        return  this.chienLuocGia.tinhGia(this.giaGoc);
    }
}
