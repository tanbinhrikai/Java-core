package bai9;

public class Student {

    private String name;
    private String studentId;
    private double score;

    public Student(String name, String studentId, double score) {
        this.name = name;
        this.studentId = studentId;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public String getStudentId() {
        return studentId;
    }

    public double getScore() {
        return score;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public void setScore(double score) {
        this.score = score;
    }
}