package day4.bai2;

public class HinhTamGiac {
    private double a;
    private double b;
    private double c;

    public boolean isHopLe() {
        return a + b > c &&  a + c > b && b + c > a;
    }

    public double dienTich() {
        return 0;
    }
}
