package day5.bai12;

public class SinhVien {
    private String ten;
    private double diem;
    private int tuoi;

    public SinhVien(String ten, double diem, int tuoi) {
        this.ten = ten;
        this.diem = diem;
        this.tuoi = tuoi;
    }

    public String getTen() { return ten; }
    public double getDiem() { return diem; }
    public int getTuoi() { return tuoi; }

    @Override
    public String toString() {
        return String.format("%s(%.1f, %dt)", ten, diem, tuoi);
    }
}