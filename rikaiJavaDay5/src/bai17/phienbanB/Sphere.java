package bai17.phienbanB;


public class Sphere implements IShape, IShape3D {

    private final double radius;

    public Sphere(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return 4 * Math.PI * radius * radius;
    }

    @Override
    public double calculateVolume() {
        return (4.0 / 3) * Math.PI * radius * radius * radius;
    }
}