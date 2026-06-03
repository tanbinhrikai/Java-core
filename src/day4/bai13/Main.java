package day4.bai13;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.function.Function;

public class Main {
    static void main() {
        SinhVien sv1 = new SinhVien("Chi", 9.0);
        sv1.setAge(20);
        sv1.setMaSv("003");
        SinhVien sv3 = new SinhVien("Bao", 8.5);
        sv3.setAge(22);
        sv3.setMaSv("001");
        SinhVien sv2 = new SinhVien("An", 9.0);
        sv2.setAge(19);
        sv2.setMaSv("002");

        SinhVien[] students = new SinhVien[3];
        students[0] = sv1;
        students[1] = sv3;
        students[2] = sv2;

//        Arrays.sort(students);
//        for (int i = 0; i < students.length; i++) {
//            System.out.println(students[i]);
//        }

//        System.out.println("Sort by age");
//        Comparator<SinhVien> comparatorAge = Comparator.comparing(SinhVien::getAge);
//        Arrays.sort(students, comparatorAge);
//        for (int i = 0; i < students.length; i++) {
//            System.out.println(students[i]);
//        }

        System.out.println("Sort by Ma sinh vien");
        Comparator<SinhVien> comparatorMSV = Comparator.comparing(SinhVien::getMaSv).reversed();
        Arrays.sort(students, comparatorMSV);
        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i]);
        }
    }
}
