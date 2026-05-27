package day3.bai9;

public class HinhHoc {
    public double dientich(double r) {
        return Math.PI * r * r;
    }

    public double dientich(double dai, double rong) {
        return dai * rong;
    }

    public double dientich(double a, double b, double c) {
        double P = (a + b + c) / 2;
        return Math.sqrt(P*(P-a) * (P -b) * (P -c));
    }

    public double dienTich(double canh, int soCanh) {
        return 0;
    }
}
