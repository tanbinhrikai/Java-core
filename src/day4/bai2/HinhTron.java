package day4.bai2;

public class HinhTron {
    private double radius;

    public boolean dieuKien(int r) {
        return r > 0;
    }

    public double chuVi() {
        return 2 * Math.PI * radius;
    }

    public double dienTich() {
        return Math.PI * radius * radius;
    }

    public HinhTron(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return String.format("Hinh tron r=%.2f: DT=%.2f, CV=%.2f", radius,dienTich(), chuVi());
    }
}
