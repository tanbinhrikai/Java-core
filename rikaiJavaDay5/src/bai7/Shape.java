package bai7;

public sealed class Shape permits Circle,Rectangle,Triangle {

    static double area(Shape shape) {
        return switch (shape) {
            case Circle c ->
                    Math.PI * c.getRadius() * c.getRadius();

            case Rectangle r ->
                    r.getWidth() * r.getHeight();

            case Triangle t -> {
                double p = (t.getA() + t.getB() + t.getC()) / 2.0;
                yield Math.sqrt(
                        p *
                                (p - t.getA()) *
                                (p - t.getB()) *
                                (p - t.getC())
                );
            }
            default -> 0.0;
        };
    }
}
