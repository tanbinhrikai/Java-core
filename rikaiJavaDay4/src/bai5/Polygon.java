package bai5;

public class Polygon {

    private class Point {
        double x;
        double y;

        Point(double x, double y) {
            this.x = x;
            this.y = y;
        }
    }



    private Point[] vertices;

    public Polygon(double[][] toaDo) {
        vertices = new Point[toaDo.length];

        for (int i = 0; i < toaDo.length; i++) {
            vertices[i] = new Point(toaDo[i][0], toaDo[i][1]);
        }
    }

    public double tinhDienTich() {
        double tong = 0;
        int n = vertices.length;

        for (int i = 0; i < n; i++) {
            Point p1 = vertices[i];
            Point p2 = vertices[(i + 1) % n];

            tong += (p1.x * p2.y) - (p2.x * p1.y);
        }

        return Math.abs(tong) / 2.0;
    }

    public double tinhChuVi() {
        double chuVi = 0;
        int n = vertices.length;

        for (int i = 0; i < n; i++) {
            Point p1 = vertices[i];
            Point p2 = vertices[(i + 1) % n];

            double dx = p2.x - p1.x;
            double dy = p2.y - p1.y;

            chuVi += Math.sqrt(dx * dx + dy * dy);
        }

        return chuVi;
    }

    public boolean isConvex() {
        int n = vertices.length;

        if (n < 3) {
            return false;
        }

        boolean dau = false;

        for (int i = 0; i < n; i++) {
            Point a = vertices[i];
            Point b = vertices[(i + 1) % n];
            Point c = vertices[(i + 2) % n];

            double cross =
                    (b.x - a.x) * (c.y - b.y) -
                            (b.y - a.y) * (c.x - b.x);

            if (i == 0) {
                dau = cross > 0;
            } else {
                if ((cross > 0) != dau) {
                    return false;
                }
            }
        }

        return true;
    }

}