package bai12;

import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Student> students = List.of(
                new Student(20, 8.5),
                new Student(22, 7.0),
                new Student(19, 9.0),
                new Student(18, 6.5)
        );

        Validator<Student> excellentStudent =
                student -> student.getScore() >= 8.0;

        Validator<Student> youngStudent =
                student -> student.getAge() < 21;

        Validator<Student> excellentAndYoung =
                excellentStudent.and(youngStudent);

        List<Student> result = students.stream()
                .filter(excellentAndYoung::test)
                .toList();

        result.forEach(System.out::println);
    }
}