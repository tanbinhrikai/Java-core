package bai2;

public class HinhTamGiac {
    private int a;
    private int b;
    private int c;

    public HinhTamGiac(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public boolean isHopLe() {
        return a + b > c && a + c > b && b + c > a;
    }

    public double Dientich() {
        double p = (a + b + c) / 2.0;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }

    public String loaiTamGiac() {
        if (a == b && b == c) {
            return "Tam giác đều";
        } else if (a == b || a == c || b == c) {
            return "Tam giác cân";
        } else if (a * a + b * b == c * c ||
                a * a + c * c == b * b ||
                b * b + c * c == a * a) {
            return "Tam giác vuông";
        } else {
            return "Tam giác thường";
        }
    }
}