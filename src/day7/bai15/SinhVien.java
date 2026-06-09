package day7.bai15;

public class SinhVien {
    private String ten;
    private String khoa;
    private double diem;

    public SinhVien(String ten, String khoa, double diem) {
        this.ten = ten;
        this.khoa = khoa;
        this.diem = diem;
    }

    public String getTen() { return ten; }
    public String getKhoa() { return khoa; }
    public double getDiem() { return diem; }

    @Override
    public String toString() {
        return ten + "(" + diem + ")"; // Format giống ví dụ đề bài
    }
}
