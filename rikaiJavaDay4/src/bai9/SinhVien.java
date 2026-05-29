package bai9;

public class SinhVien {
    private String name;
    private String masv;

    public double getDiem() {
        return diem;
    }

    public void setDiem(double diem) {
        this.diem = diem;
    }

    public String getMasv() {
        return masv;
    }

    public void setMasv(String masv) {
        this.masv = masv;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private double diem;

    public SinhVien(String name, String masv, double diem) {
        this.name = name;
        this.masv = masv;
        this.diem = diem;
    }
}
