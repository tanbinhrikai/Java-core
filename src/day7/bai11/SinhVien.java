package day7.bai11;

public class SinhVien {
    String name;
    int age;

    public SinhVien(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public SinhVien(String name) {
        this.name = name;
    }

    public void inRa() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "SinhVien{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
