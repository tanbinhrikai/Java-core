package day6.bai11;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class Main {
    public static <T extends Comparable<T>> Pair<T, T> minMax(List<T> list) {
        T min = list.getFirst();
        T max = list.getFirst();
        for(T t : list) {
            if(t.compareTo(min) < 0) min = t;
            if(t.compareTo(max) > 0) max = t;
        }
        return new Pair<>(min, max);
    }

    public static <K, V> Pair<K, V> fromMapEntry(Map.Entry<K, V> entry) {
        return new Pair<>(entry.getKey(), entry.getValue());
    }

    public static void main(String[] args) {
        System.out.println("=== TEST PAIR ===");
        Pair<String, Integer> p = new Pair<>("Java", 21);
        System.out.println(p);
        Pair<Integer, String> pSwapped = p.swap();
        System.out.println(pSwapped);

        System.out.println(minMax(Arrays.asList(3,1,4,1,5)));


    }
}
