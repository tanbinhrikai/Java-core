package day7.bai14;

public class Main {

    public static void main(String[] args) {
        Shape s = new Circle(new Point(0, 0), 5.0);
        Shape s2 = new Rectangle(new Point(0, 10), new Point(10, 0));


        // record pattern (java 21)
        if (s instanceof Circle(Point(int x, int y), double r)) {
            System.out.printf("""
                    Center: (" + %d + "," + %d + ")");
                    """, x, y);
            System.out.println("Radius: " + r);
        }

        switch (s2) {
            case Circle(Point(int x, int y), double r) -> {
                System.out.printf("""
                    Circle: (" + %d + "," + %d + ")");
                    """, x, y);
                System.out.println("Radius: " + r);
            }
            case Rectangle(Point(int x, int y), Point(int x1, int y1)) -> {
                System.out.printf("""
                    Rectangle: (" + %d + "," + %d + ")")
                                ("%d "," "%d)
                    """, x, y, x1, y1);
            }
        }


    }
}
