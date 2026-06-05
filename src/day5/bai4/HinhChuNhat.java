package day5.bai4;

public class HinhChuNhat extends HinhHoc{
    double a, b;

    public HinhChuNhat(double a, double b) {
        this.a = a;
        this.b = b;
    }

    @Override
    double dienTich() {
        return a * b;
    }

    @Override
    double chuVi() {
        return (a + b) * 2;
    }

    @Override
    String tenHinh() {
        return String.format("Hinh chu nhat (%.2fx%.2f)", a, b);
    }
}
