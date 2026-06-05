package day5.bai4;

public class HinhTron extends HinhHoc{
    double r;

    public HinhTron(double r) {
        this.r = r;
    }

    @Override
    double dienTich() {
        return Math.PI * r * r;
    }

    @Override
    double chuVi() {
        return 2 * Math.PI * r;
    }

    @Override
    String tenHinh() {
        return String.format("Hinh tron (r=%.2f)", r);
    }
}
