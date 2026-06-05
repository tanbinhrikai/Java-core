package day5.bai7;

public final class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    double dienTich() {
        return Math.PI * radius * radius;
    }
}