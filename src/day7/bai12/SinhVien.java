package day7.bai12;

public class SinhVien {
    String name;
    double score;

    public SinhVien(String name, double score) {
        this.name = name;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "SinhVien{" +
                "name='" + name + '\'' +
                ", score=" + score +
                '}';
    }
}
