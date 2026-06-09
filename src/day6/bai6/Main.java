package day6.bai6;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {
    static void main() {
        List<SinhVien> svs = new ArrayList<>();
        svs.add(new SinhVien("duy", 5.5));
        svs.add(new SinhVien("bao", 7.5));
        svs.add(new SinhVien("hung", 9.1));
        svs.add(new SinhVien("manh", 4.5));

        // ConcurrentModificationException
//        for(SinhVien sv : svs) {
//            if(sv.getScore() < 5) {
//                svs.remove(sv);
//            }
//        }

        Iterator<SinhVien> it = svs.iterator();
        while (it.hasNext()) {
            if(it.next().getScore() < 5) {
                it.remove();
            }
        }

        svs.removeIf(sinhVien -> sinhVien.getScore() < 5);
    }
}
