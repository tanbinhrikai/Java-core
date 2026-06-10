package day5.bai11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static <T extends Number> double tinhTong(List<T> list) {
        double tong = 0.0;
        for (T so : list) {
            tong += so.doubleValue();
        }
        return tong;
    }

    public static void inDanhSach(List<?> list) {
        for (Object obj : list) {
            System.out.print(obj + " ");
        }
        System.out.println();
    }

    public static <T extends Comparable<T>> T timMax(List<T> list) {
        T max = list.getFirst();
        for(T t : list) {
            if(t.compareTo(max) > 0) {
                max = t;
            }
        }
        return  max;
    }

    public static void copy(List<? super Integer> dest, List<? extends Integer> src) {
        dest.addAll(src);
    }

    public static void main(String[] args) {
        System.out.println("Tổng 1: " + tinhTong(Arrays.asList(1, 2, 3)));
        System.out.println("Tổng 2: " + tinhTong(Arrays.asList(1.5, 2.5)));
        System.out.println("timMax: " + timMax(Arrays.asList("apple","mango","banana")));
        System.out.println("Max Integer: " + timMax(Arrays.asList(5, 9, 3, 7)));

        List<Number> destList = new ArrayList<>(Arrays.asList(1.1, 2.2)); // List<Number> là cha của Integer (thỏa mãn ? super Integer)
        List<Integer> srcList = Arrays.asList(10, 20, 30);
        copy(destList, srcList);

        inDanhSach(destList);
    }
}
