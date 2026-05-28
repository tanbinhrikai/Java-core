package day4.bai15;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

public class PhongKhachSan {
    private static Map<String, PhongKhachSan> map = new HashMap<>();

    public enum LoaiPhong {
        SINGLE(500000),
        DOUBLE(900000),
        SUITE(1500000);

        final double giaPhongMotDem;
        LoaiPhong(double price) {
            giaPhongMotDem = price;
        }
    }

    private String soPhong;
    private LoaiPhong loaiPhong;
    private String tinhTrang;
    private LocalDate ngayNhan;
    private LocalDate ngayTra;

    public PhongKhachSan(String soPhong, LoaiPhong loaiPhong, String tinhTrang, LocalDate ngayNhan, LocalDate ngayTra) {
        this.soPhong = soPhong;
        this.loaiPhong = loaiPhong;
        this.tinhTrang = tinhTrang;
        this.ngayNhan = ngayNhan;
        this.ngayTra = ngayTra;

        map.put(soPhong, this);
    }

    public static double tinhTienPhong() {
        int soDem = 0;
        return 0;
    }

    public static PhongKhachSan timPhong(LoaiPhong loai) {
        return null;
    }
}
