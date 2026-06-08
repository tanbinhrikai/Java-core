package bai13;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;

public class Student implements Comparable<Student> {

    private double score;
    private String name;
    private int age;

    public Student(double score, String name, int age) {
        this.score = score;
        this.name = name;
        this.age = age;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public int compareTo(Student other) {
        int compareScore = Double.compare(this.score, other.score);

        if (compareScore != 0) {
            return -compareScore; // sort score DESC
        }

        return this.name.compareTo(other.name);
    }

    public static void main(String[] args) {

        String[] names = {
                "An", "Binh", "Cuong", "Dung",
                "Hieu", "Linh", "Mai", "Nam"
        };

        int n = 10;
        Student[] students = new Student[n];
        Random rd = new Random();

        for (int i = 0; i < n; i++) {
            int age = rd.nextInt(18, 28);
            String name = names[rd.nextInt(names.length)];
            double score = rd.nextDouble(0, 10);

            students[i] = new Student(score, name, age);
        }

        Arrays.sort(students);

        System.out.println("Sort by score:");
        for (Student s : students) {
            System.out.println(s.name + " " + s.score);
        }

        Comparator<Student> byAge = Comparator.comparing(Student::getAge);

        Arrays.sort(students, byAge);

        System.out.println("\nSort by age:");
        for (Student s : students) {
            System.out.println(s.name + " " + s.age);
        }
    }
}