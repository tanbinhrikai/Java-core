package day5.bai7;

public class Main {
    public static double area(Shape s) {
        return switch (s) {
            case Circle c -> c.dienTich();
            case Rectangle r -> r.dienTich();
            case Triangle t -> t.dienTich();
        };
    }

    static void main() {
        Shape circle = new Circle(5);
        Shape rectangle = new Rectangle(4, 6);
        Shape triangle = new Triangle(3, 4, 5);

        System.out.printf("area(new Circle(5)) = %.2f%n", area(circle));
        System.out.printf("area(new Rectangle(4,6)) = %.1f%n", area(rectangle));
        System.out.printf("area(new Triangle(3,4,5)) = %.1f%n", area(triangle));
    }
}