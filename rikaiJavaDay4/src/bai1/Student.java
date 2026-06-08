package bai1;

import java.util.Objects;

public class Student {
    private String studentId;
    private String fullName;
    private int age;
    private double gpa;

    private static int count = 0;

    public Student() {
        count++;
    }

    public Student(String studentId, String fullName, int age, double gpa) {
        this.studentId = studentId;
        this.fullName = fullName;
        setAge(age);
        setGpa(gpa);
        count++;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age >= 18 && age <= 30) {
            this.age = age;
        } else {
            throw new IllegalArgumentException("Age must be between 18 and 30");
        }
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        if (gpa >= 0 && gpa <= 10) {
            this.gpa = gpa;
        } else {
            throw new IllegalArgumentException("GPA must be between 0 and 10");
        }
    }

    public static int getCount() {
        return count;
    }

    @Override
    public String toString() {
        return "Student{studentId=" + studentId +
                ", fullName=" + fullName +
                ", age=" + age +
                ", gpa=" + gpa + "}";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student)) return false;
        Student student = (Student) o;
        return Objects.equals(studentId, student.studentId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(studentId);
    }
}