package bai9;

public class HinhHoc {

    public double area(double r) {
        return Math.PI * r * r;
    }

    public double area(double length, double width) {
        return length * width;
    }

    public double area(double a, double b, double c) {
        double p = (a + b + c) / 2;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }

    public double area(double side, int nSides) {
        double apothem = side / (2 * Math.tan(Math.PI / nSides));
        return (nSides * side * apothem) / 2;
    }
}