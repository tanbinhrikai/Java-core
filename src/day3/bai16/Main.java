package day3.bai16;

import java.util.ArrayList;
import java.util.Comparator;

public class Main {
    static void main() {
        ArrayList<SinhVien> students = new ArrayList<>();
        students.add(new SinhVien("An", 9.0));
        students.add(new SinhVien("Bao", 8.5));
        students.add(new SinhVien("Chi", 9.0));
        students.add(new SinhVien("Dao", 8.5));


//        students.sort(new Comparator<SinhVien>() {
//            @Override
//            public int compare(SinhVien o1, SinhVien o2) {
//                if(o1.score > o2.score)
//                    return 1;
//                else if(o1.score == o2.score)
//                    return o1.name.compareTo(o2.name);
//                else {
//
//                }
//            }
//        });
    }
}
