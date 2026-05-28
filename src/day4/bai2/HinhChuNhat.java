package day4.bai2;

public class HinhChuNhat {
    private double dai;
    private double rong;

    public HinhChuNhat(double dai, double rong) {
        this.dai = dai;
        this.rong = rong;
    }

    public double chuVi() {
        return (dai + rong) * 2;
    }

    public double dienTich() {
        return dai * rong;
    }

    public boolean isDuongVuong() { // kiem tra xem co phai hinh vuong
        // 0.1 + 0.2 == 0.3 => false
        return Math.abs(dai - rong) < 0.0001;
    }

    @Override
    public String toString() {
        return String.format("Hinh chu nhat %dx%d: DT=%d, CV=%d la hinhHCN (%s)", dai, rong, dienTich(), chuVi(), isDuongVuong() ? "vuong" : "khong vuong");
    }
}
