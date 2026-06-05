package day5.bai7;


public final class Rectangle extends Shape {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    double dienTich() {
        return width * height;
    }
}