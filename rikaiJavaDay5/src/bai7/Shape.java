package bai7;

public sealed class Shape permits Circle,Rectangle,Triangle {

    static double area(Shape s) {
        return switch (s) {
            case Circle c -> Math.PI * c.getRadius() * c.getRadius();

            case Rectangle r -> r.getWidth() * r.getHeight();

            case Triangle t -> {
                double p = (t.getA() + t.getB() + t.getC()) / 2;
                yield Math.sqrt(p * (p - t.getA()) * (p - t.getB()) * (p - t.getC()));
            }
            default -> throw new IllegalStateException("Unknown shape");
        };
    }
}
