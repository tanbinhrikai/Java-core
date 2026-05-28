package bai2;

public class HinhTron {
    private int radius;

    public HinhTron(int radius) {
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public void dieuKien() {
        if (radius <= 0) {
            System.out.println("Bán kính phải lớn hơn 0");
        }
    }

    public double chuVi() {
        return 2 * Math.PI * radius;
    }

    public double dienTich() {
        return Math.PI * radius * radius;
    }


}