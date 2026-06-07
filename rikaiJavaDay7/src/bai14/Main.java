package bai14;

public class Main {
    public static void main(String[] args) {
        Shape s1 =
                new Circle(
                        new Point(0, 0),
                        5.0
                );

        Shape s2 =
                new Rectangle(
                        new Point(0, 10),
                        new Point(20, 0)
                );

        if (s1 instanceof Circle(
                Point(int x, int y),
                double r
        )) {

            System.out.println(
                    "Center: (" + x + "," + y + ")"
            );

            System.out.println(
                    "Radius: " + r
            );
        }
        printShape(s1);
        printShape(s2);
    }
    static void printShape(Shape shape) {

        switch (shape) {

            case Circle(
                    Point(int x, int y),
                    double r
            ) -> {

                System.out.println(
                        "Circle -> center=("
                                + x + "," + y
                                + "), radius=" + r
                );
            }

            case Rectangle(
                    Point(int x1, int y1),
                    Point(int x2, int y2)
            ) -> {

                System.out.println(
                        "Rectangle -> topLeft=("
                                + x1 + "," + y1
                                + "), bottomRight=("
                                + x2 + "," + y2
                                + ")"
                );
            }
        }
    }
}
