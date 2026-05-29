package bai13;

import javax.xml.namespace.QName;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;

public class SinhVien implements  Comparable<SinhVien> {
    private double diem;
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getDiem() {
        return diem;
    }

    public void setDiem(double diem) {
        this.diem = diem;
    }

    @Override
    public int compareTo(bai13.SinhVien o) {
        int compareToDiem = Double.compare(this.diem, o.diem);
        if(compareToDiem!=0){
            return  -compareToDiem;
        }
        int compareName = this.name.compareTo(o.name);
        return  compareName;
    }

    public SinhVien(double diem, String name ,int age) {
        this.diem = diem;
        this.name = name;
        this.age  = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    static void main() {
        String[] tenSV = {
                "An",
                "Binh",
                "Cuong",
                "Dung",
                "Hieu",
                "Linh",
                "Mai",
                "Nam"
        };


        int n = 10;
        SinhVien[] sinhViens = new SinhVien[n];
        for(int i=0; i<n;i++){
            Random rd = new Random();
            int age  = (int) (Math.random() * 27);
            String ten = tenSV[rd.nextInt(tenSV.length)];
            double diem = Math.random() * 10;
            sinhViens[i] = new SinhVien(diem, ten,age);

        }

        Arrays.sort(sinhViens);

        for(int i = 0;i< n ;i++){
            System.out.println(" " + sinhViens[i].name + " " + sinhViens[i].diem);
        }


        Comparator<SinhVien> cmpAge = Comparator.comparing(
                SinhVien::getAge
        );


        Arrays.sort(sinhViens,cmpAge);

    }
}
