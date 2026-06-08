package bai2;

public class Rectangle {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double perimeter() {
        return 2 * (length + width);
    }

    public double area() {
        return length * width;
    }

    public boolean isSquare() {
        return length == width;
    }

    @Override
    public String toString() {
        return String.format(
                "Rectangle %.0fx%.0f: area=%.0f, perimeter=%.0f, %s",
                length, width,
                area(),
                perimeter(),
                isSquare() ? "square" : "not square"
        );
    }
}