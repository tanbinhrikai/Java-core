package bai12;

public class Student {

    private final int age;
    private final double score;

    public Student(int age, double score) {
        this.age = age;
        this.score = score;
    }

    public int getAge() {
        return age;
    }

    public double getScore() {
        return score;
    }

    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +
                ", score=" + score +
                '}';
    }
}