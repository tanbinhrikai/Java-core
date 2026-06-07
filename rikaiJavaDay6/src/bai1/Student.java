package bai1;

public class Student implements Comparable<Student> {

    private String fullName;
    private int age;
    private double score;

    public Student(String fullName, int age, double score) {
        this.fullName = fullName;
        this.age = age;
        this.score = score;
    }

    @Override
    public int compareTo(Student other) {
        return Double.compare(this.score, other.score);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (obj instanceof Student student) {
            return fullName.equals(student.fullName)
                    && age == student.age;
        }

        return false;
    }

    @Override
    public String toString() {
        return fullName + " " + age + " " + score;
    }
}