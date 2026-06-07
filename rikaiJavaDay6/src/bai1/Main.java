package bai1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {

    private static final List<Student> students = new ArrayList<>();

    public static void main(String[] args) {

        int n = 10;

        for (int i = 0; i < n; i++) {
            double score = (int) (Math.random() * 10) + 1;
            String fullName = "name" + i;
            int age = i;

            students.add(new Student(fullName, age, score));
        }

        System.out.println("Sau khi thêm:");
        printByForEach();

        Student student = new Student("Le Xuan Cong", 22, 9.5);

        addStudent(2, student);

        System.out.println("\nSau khi chèn:");
        printByIterator();

        System.out.println("\nSau khi xóa sinh viên thứ 5:");
        removeStudent(4);
        printByFor();

        System.out.println("\nSau khi xóa theo đối tượng:");
        removeStudent(student);
        printByFor();

        System.out.println("\nSau khi sắp xếp:");
        sortStudents();
        printByFor();
    }

    public static void addStudent(int index, Student student) {
        students.add(index, student);
    }

    public static void removeStudent(int index) {
        students.remove(index);
    }

    public static void removeStudent(Student student) {
        students.remove(student);
    }

    public static Student findStudent(Student student) {
        int index = students.indexOf(student);

        if (index == -1) {
            System.out.println("Not found");
            return null;
        }

        return students.get(index);
    }

    public static void printByForEach() {
        students.forEach(System.out::println);
    }

    public static void printByFor() {
        for (int i = 0; i < students.size(); i++) {
            System.out.println(students.get(i));
        }
    }

    public static void printByIterator() {
        Iterator<Student> iterator = students.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    public static void sortStudents() {
        students.sort(null);
    }
}