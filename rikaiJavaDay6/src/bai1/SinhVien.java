package bai1;

public class SinhVien implements Comparable<SinhVien> {
    @Override
    public int compareTo(SinhVien o) {
        return Double.compare(this.diem, o.diem);
    }

    private String name;
    private int age;
    private double diem;

    public SinhVien(String name, int age,double diem) {
        this.diem = diem;
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object obj) {
       if(this == obj){
           return  true;
       }
       if(obj instanceof SinhVien){
           SinhVien sv = (SinhVien) obj;
           return sv.name.equals(this.name) && sv.age == this.age;
       }
       return false;
    }

    @Override
    public String toString() {
        return this.name+  " " + this.age + " " + this.diem;
    }

}
