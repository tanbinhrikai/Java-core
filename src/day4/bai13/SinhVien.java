package day4.bai13;

public class SinhVien implements Comparable<SinhVien>{
    private String maSv;
    private int age;
    private String name;
    private double score;

    public SinhVien(String name, double score) {
        this.name = name;
        this.score = score;
    }

    public double getScore() {
        return score;
    }

    public void setMaSv(String maSv) {
        this.maSv = maSv;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getMaSv() {
        return maSv;
    }

    public int getAge() {
        return age;
    }

    @Override
    public int compareTo(SinhVien o) {
        if(Double.compare(this.score, o.score) == 0) {
            return this.name.compareTo(o.name);
        };
        return Double.compare(o.score, this.score);
    }

    @Override
    public String toString() {
        return "SinhVien{" +
                "maSv='" + maSv + '\'' +
                ", age=" + age +
                ", name='" + name + '\'' +
                ", score=" + score +
                '}';
    }
}
