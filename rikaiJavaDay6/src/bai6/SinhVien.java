package bai6;

public class SinhVien {

    private String ten;
    private double diem;

    public SinhVien(String ten, double diem) {
        this.ten = ten;
        this.diem = diem;
    }

    public double getDiem() {
        return diem;
    }

    @Override
    public String toString() {
        return ten + " - " + diem;
    }
}