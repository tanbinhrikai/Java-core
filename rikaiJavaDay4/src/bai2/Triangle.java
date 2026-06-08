package bai2;

public class Triangle {
    private double a;
    private double b;
    private double c;

    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public boolean isValid() {
        return a + b > c && a + c > b && b + c > a;
    }

    public double area() {
        double p = (a + b + c) / 2.0;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }

    public String getType() {
        if (!isValid()) return "Invalid triangle";

        double x = a, y = b, z = c;

        if (x > y) { double t = x; x = y; y = t; }
        if (y > z) { double t = y; y = z; z = t; }
        if (x > y) { double t = x; x = y; y = t; }

        if (a == b && b == c) return "tam giac deu";
        if (a == b || a == c || b == c) {
            if (Math.abs(x * x + y * y - z * z) < 1e-9)
                return "can vuong";
            return "tam giac cam";
        }

        if (Math.abs(x * x + y * y - z * z) < 1e-9)
            return "tam giac vuong";

        return "tam giac thuong";
    }

    @Override
    public String toString() {
        return String.format(
                "Triangle %.0f-%.0f-%.0f: area=%.2f, %s",
                a, b, c, area(), getType()
        );
    }
}