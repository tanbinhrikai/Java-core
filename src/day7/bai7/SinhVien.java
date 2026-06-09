package day7.bai7;

import java.util.Objects;

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
        return "SinhVien{ten='" + ten + "', diem=" + diem + ", tuoi=" + tuoi + '}';
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof SinhVien) {
            SinhVien other = (SinhVien) obj;
            return ten.equalsIgnoreCase(other.ten)
                    && Double.compare(diem, other.diem) == 0
                    && tuoi == other.tuoi;
        }
        return false;
    }

    @Override
    public int hashCode() {
        String tenChuanHoa = (this.ten == null) ? null : this.ten.toLowerCase();
        return Objects.hash(tenChuanHoa, diem, tuoi);
    }
}