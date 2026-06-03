package day4.bai5;

public class Polygon {
    private Point[] points;

    public Polygon(int[][] points) {
        this.points = new Point[points.length];

        for(int i = 0; i < points.length; i++) {
            this.points[i] = new Point();
            this.points[i].x = points[i][0];
            this.points[i].y = points[i][1];
        }
    }

    public double tinhDienTich() {
        double a = 0;
        double b = 0;
        for(int i = 0; i < points.length - 1; i++) {
            a = a + points[i].x * points[i + 1].y;
            b = b + points[i + 1].x * points[i].y;
        }
        return Math.abs(a - b) / 2;
    }

    public double tinhChuVi() {
        double d = 0;
        for(int i = 0; i < points.length; i++) {

            Point point1 = points[i];

            Point point2;
            if(i + 1 == points.length) {
                point2 = points[0];
            }
            else {
                point2 = points[i + 1];
            }
            d = d + Math.sqrt(Math.pow(point2.x - point1.x, 2) + Math.pow(point2.y - point1.y, 2));
        }
        return d;
    }

    public boolean isConvex() {
        boolean rePhai = false;
        boolean reTrai = false;
        for(int i = 0; i < points.length; i++) {
            Point a = points[i];
            Point b = points[(i + 1) % points.length];
            Point c = points[(i + 1) % points.length];

            double z = (b.x - a.x) * (c.y - b.y) - (b.y-a.y) * (c.x - b.x);
            if(z > 0) {
                reTrai = true;
            }
            else if(z < 0) rePhai = true;

            if(rePhai && reTrai)
                return false;

        }
        return true;
    }

    private class Point {
        private double y;
        private double x;
    }
}
