package bai4;

public abstract class Shape {

    public abstract double getArea();
    public abstract double getPerimeter();
    public abstract String getName();

    public final void printInfo() {
        System.out.println("Shape information");
    }

    public static Shape findLargestByArea(Shape[] shapes) {
        if (shapes == null || shapes.length == 0) return null;

        Shape max = shapes[0];

        for (Shape shape : shapes) {
            if (shape.getArea() > max.getArea()) {
                max = shape;
            }
        }
        return max;
    }
}