package bai9;

import java.util.List;

public  class SinhVien {
    private String ten;
    private double diem;
    private List<String> monHoc;

    public SinhVien(String ten, double diem, List<String> monHoc) {
        this.ten = ten;
        this.diem = diem;
        this.monHoc = monHoc;
    }

    public String getTen() {
        return ten;
    }

    public double getDiem() {
        return diem;
    }

    public List<String> getMonHoc() {
        return monHoc;
    }

    @Override
    public String toString() {
        return ten + "(" + diem + ")";
    }
}