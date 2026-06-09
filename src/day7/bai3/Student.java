package day7.bai3;

public record Student(String id, String name, double gpa) {
    public Student {
        if(gpa < 0) {
            throw new IllegalArgumentException("GPA >= 0");
        }
    }
}
