package bai6;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<SinhVien> students = new ArrayList<>();

        students.add(new SinhVien("An", 8));
        students.add(new SinhVien("Binh", 4));
        students.add(new SinhVien("Chi", 9));
        students.add(new SinhVien("Dung", 3));

        System.out.println("Truoc khi xoa:");
        students.forEach(System.out::println);

        removeByRemoveIf(students);

        System.out.println("\nSau khi xoa:");
        students.forEach(System.out::println);



    }



    public static void removeByIterator(List<SinhVien> list) {

        Iterator<SinhVien> iterator = list.iterator();

        while (iterator.hasNext()) {

            SinhVien sv = iterator.next();

            if (sv.getDiem() < 5) {
                iterator.remove();
            }
        }
    }

    public static void removeByRemoveIf(List<SinhVien> list) {
        list.removeIf(sv -> sv.getDiem() < 5);
    }


    public static List<SinhVien> removeByStream(List<SinhVien> list) {
        return list.stream()
                .filter(sv -> sv.getDiem() >= 5)
                .toList();
    }
}
