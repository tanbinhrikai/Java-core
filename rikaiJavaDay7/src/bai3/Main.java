package bai3;

public class Main {
    public static void main(String[] args) {
        Point p = new Point(3, 5);
        System.out.println(p.x());
        System.out.println(p.toString());
        System.out.println(  p.equals(new Point(3,5)));

        Student student = new Student("1","lexuancong",-1.0);
    }
}
