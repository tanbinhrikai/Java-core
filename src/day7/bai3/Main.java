package day7.bai3;

public class Main {
    public static void main(String[] args) {
        Point p = new Point(3,5);
        System.out.println(p.x());
        System.out.println(p.toString());
        System.out.println(p.equals(new Point(3,5)));
        System.out.println(p.hashCode());

        Student student = new Student("SV001", "AN", -1);
        System.out.println(student);

        Pair<String, Integer> pair = new Pair<>("A", 6);
        System.out.println(pair.hashCode());
    }
}
