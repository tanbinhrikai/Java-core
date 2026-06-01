package bai15;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;

public class PhongKhachSan {
    private int soPhong;
    private LoaiPhong loaiPhong;
    private String tinhTrang;
    private LocalDate ngayNhan;
    private LocalDate ngayTra;

    private static Map<String,PhongKhachSan> danhSach;


    public LocalDate getNgayTra() {
        return ngayTra;
    }

    public void setNgayTra(LocalDate ngayTra) {
        this.ngayTra = ngayTra;
    }

    public LocalDate getNgayNhan() {
        return ngayNhan;
    }

    public void setNgayNhan(LocalDate ngayNhan) {
        this.ngayNhan = ngayNhan;
    }

    public String getTinhTrang() {
        return tinhTrang;
    }

    public void setTinhTrang(String tinhTrang) {
        this.tinhTrang = tinhTrang;
    }

    public LoaiPhong getLoaiPhong() {
        return loaiPhong;
    }

    public void setLoaiPhong(LoaiPhong loaiPhong) {
        this.loaiPhong = loaiPhong;
    }

    public int getSoPhong() {
        return soPhong;
    }

    public void setSoPhong(int soPhong) {
        this.soPhong = soPhong;
    }

    public PhongKhachSan(int soPhong, LoaiPhong loaiPhong, String tinhTrang, LocalDate ngayNhan, LocalDate ngayTra) {
        this.soPhong = soPhong;
        this.loaiPhong = loaiPhong;
        this.tinhTrang = tinhTrang;
        this.ngayNhan = ngayNhan;
        this.ngayTra = ngayTra;
    }

    public  double tinhTienPhong(int soDem){
        return  this.loaiPhong.getGiaban()  * soDem + (loaiPhong.getGiaban()*soDem*0.1);
    }

    public static List<PhongKhachSan>timPhong(LoaiPhong loaiPhong) {
        return  danhSach.values().stream().filter(phongKhachSan ->
                phongKhachSan.loaiPhong == loaiPhong && phongKhachSan.tinhTrang.equals("trống"))
                .toList();
        
    }

    public void checkIn(LocalDate localDateCheckin ,LocalDate localDateCheckout) {
        this.ngayTra = localDateCheckout;
        this.ngayNhan = localDateCheckin;
        this.tinhTrang = "da thue";
    }

    public  void checkout(LocalDate localDateCheckout  ){
        this.ngayTra = localDateCheckout;
        this.tinhTrang ="trong";
    }


}
