package day4.bai1;

import java.util.Objects;

public class SinhVien {
    public static int count;

    private String maSv;
    private String hoTen;
    private int age;
    private double diemTB;

    public SinhVien(String maSv, String hoTen, int age, double diemTB) {
        this.maSv = maSv;
        this.hoTen = hoTen;
        this.age = age;
        this.diemTB = diemTB;
        count++;
    }

    public SinhVien() {
        count++;
    }

    public String getMaSv() {
        return maSv;
    }

    public void setMaSv(String maSv) {
        this.maSv = maSv;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age >= 18 && age <= 30) {
            this.age = age;
        }
        else {
            System.out.println("age tu 18-30");
        }
    }

    public double getDiemTB() {
        return diemTB;
    }

    public void setDiemTB(double diemTB) {
        if(diemTB >= 0 && diemTB <=10)
            this.diemTB = diemTB;
        else System.out.println("DiemTB 0-10");
    }

    @Override
    public String toString() {
        return "SinhVien{" +
                "maSv='" + maSv + '\'' +
                ", hoTen='" + hoTen + '\'' +
                ", age=" + age +
                ", diemTB=" + diemTB +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        SinhVien sinhVien = (SinhVien) o;
        return age == sinhVien.age && Double.compare(diemTB, sinhVien.diemTB) == 0 && Objects.equals(maSv, sinhVien.maSv) && Objects.equals(hoTen, sinhVien.hoTen);
    }

    @Override
    public int hashCode() {
        return Objects.hash(maSv, hoTen, age, diemTB);
    }


}
