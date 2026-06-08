package bai5;

public class Polygon {

    private static class Point {
        double x;
        double y;

        Point(double x, double y) {
            this.x = x;
            this.y = y;
        }
    }

    private Point[] vertices;

    public Polygon(double[][] coordinates) {
        vertices = new Point[coordinates.length];

        for (int i = 0; i < coordinates.length; i++) {
            vertices[i] = new Point(coordinates[i][0], coordinates[i][1]);
        }
    }

    public double area() {
        double sum = 0;
        int n = vertices.length;

        for (int i = 0; i < n; i++) {
            Point p1 = vertices[i];
            Point p2 = vertices[(i + 1) % n];

            sum += (p1.x * p2.y) - (p2.x * p1.y);
        }

        return Math.abs(sum) / 2.0;
    }

    public double perimeter() {
        double result = 0;
        int n = vertices.length;

        for (int i = 0; i < n; i++) {
            Point p1 = vertices[i];
            Point p2 = vertices[(i + 1) % n];

            double dx = p2.x - p1.x;
            double dy = p2.y - p1.y;

            result += Math.sqrt(dx * dx + dy * dy);
        }

        return result;
    }

    public boolean isConvex() {
        int n = vertices.length;

        if (n < 3) return false;

        boolean sign = false;

        for (int i = 0; i < n; i++) {
            Point a = vertices[i];
            Point b = vertices[(i + 1) % n];
            Point c = vertices[(i + 2) % n];

            double cross =
                    (b.x - a.x) * (c.y - b.y) -
                            (b.y - a.y) * (c.x - b.x);

            if (i == 0) {
                sign = cross > 0;
            } else {
                if ((cross > 0) != sign) {
                    return false;
                }
            }
        }

        return true;
    }
}