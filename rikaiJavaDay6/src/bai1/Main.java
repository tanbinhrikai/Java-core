package bai1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Main {
    private static List<SinhVien> sinhViens = new ArrayList<SinhVien>();

    public static void main(String[] args) {
        int n  = 10;
        for(int i = 0; i < n; i++){
            int diem = (int) (Math.random() * 10) + 1;
            String name = "name".concat(String.valueOf(i));
            int age = i;
            SinhVien sinhVien = new SinhVien(name, age, diem);
            sinhViens.add(sinhVien);
        }
        System.out.println(" sau khi thêm ");
        duyetByForEach();
//        duyetByFor();
//        duyetByIterator();

        SinhVien sinhVien = new SinhVien("le xuan cogn",22,9.5);
        addSinhVien(2,sinhVien);
        System.out.println(" kết quả sau khi chèn ");
        duyetByIterator();


        System.out.println("lết quả sau khi remove sinh viên thứ 5");
        removeSinhVien(4);
        duyetByFor();


        System.out.println("sau khi xoa ptu theo sinh vien");
        reorderSinhVien(sinhVien);

        duyetByFor();


        System.out.println("sau khi dc sxep ");
        sapXep();
        duyetByFor();








    }

    public static void addSinhVien(int index,SinhVien sinhVien){
        sinhViens.add(index,sinhVien);
    }

    public static void removeSinhVien(int index){
        sinhViens.remove(index);
    }

    public static void reorderSinhVien(SinhVien sinhVien){
        sinhViens.remove(sinhVien);

    }

    public static SinhVien findSinhVien(SinhVien sinhVien){
       int index = sinhViens.indexOf(sinhVien);
       if(index == -1){
           System.out.println("not found");
           return  null;
       }
       return sinhViens.get(index);
    }

    public static void duyetByForEach(){
        sinhViens.forEach(sinhVien -> System.out.println(sinhVien.toString()));

    }

    public static void duyetByFor(){
        for (int i=0;i< sinhViens.size();i++){
            System.out.println(sinhViens.get(i).toString());
        }
    }

    public static void duyetByIterator(){
        Iterator<SinhVien> iterator = sinhViens.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next().toString());
        }
    }

    public static void sapXep(){
        Collections.sort(sinhViens);

    }
}
