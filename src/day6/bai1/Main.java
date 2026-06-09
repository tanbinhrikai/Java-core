package day6.bai1;

import java.lang.reflect.Array;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        ArrayList<SinhVien> sinhViens = new ArrayList<>();
        sinhViens.add(new SinhVien("An", 9.0));
        sinhViens.add(new SinhVien("Chi", 7.0));
        sinhViens.add(new SinhVien("Bao", 8.5));
        sinhViens.add(new SinhVien("Cong", 5.2));
        sinhViens.add(new SinhVien("Minh", 9.5));

        sinhViens.add(1, new SinhVien("Duy", 7.7));

        System.out.println("==============");


        System.out.println("==============");
        sinhViens.remove(4);


        System.out.println("==============");

        sinhViens.remove(new SinhVien("Chi", 7.0));

        System.out.printf("%b %n", sinhViens.contains(new SinhVien("Bao", 8.5)));
        System.out.printf("%d %n", sinhViens.indexOf(new SinhVien("Bao", 8.5)));


        for(SinhVien s : sinhViens) {
            System.out.println(s);
        }


        Collections.sort(sinhViens, new Comparator<SinhVien>() {
            @Override
            public int compare(SinhVien o1, SinhVien o2) {
                return Double.compare(o1.getScore(), o2.getScore());
            }
        });


        Iterator<SinhVien> it = sinhViens.iterator();
        while(it.hasNext()) {
            System.out.println(it.next());
        }


    }
}
