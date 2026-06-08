package bai14;

import bai13.Student;

import java.util.Comparator;

public class Main {

    public static void main(String[] args) {

        Comparator<Student> comparator = new Comparator<Student>() {
            @Override
            public int compare(Student a, Student b) {
                return Double.compare(a.getScore(), b.getScore());
            }
        };

        Comparator<Student> comparatorLambda = (a, b) ->
                Double.compare(a.getScore(), b.getScore());

        Comparator<Student> comparatorRef =
                Comparator.comparingDouble(Student::getScore).reversed();
    }
}