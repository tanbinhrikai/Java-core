package bai10;

public class SinhVien {

    private String ten;
    private String khoa;
    private double diem;

    public SinhVien(String ten, String khoa, double diem) {
        this.ten = ten;
        this.khoa = khoa;
        this.diem = diem;
    }

    public String getTen() {
        return ten;
    }

    public String getKhoa() {
        return khoa;
    }

    public double getDiem() {
        return diem;
    }

    @Override
    public String toString() {
        return "SinhVien{" +
                "ten='" + ten + '\'' +
                ", khoa='" + khoa + '\'' +
                ", diem=" + diem +
                '}';
    }
}