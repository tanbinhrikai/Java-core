package bai11;

import java.util.List;
import java.util.Map;

public class Pair<A, B> {

    private final A first;
    private final B second;

    public Pair(A first, B second) {
        this.first = first;
        this.second = second;
    }

    public A getFirst() {
        return first;
    }

    public B getSecond() {
        return second;
    }

    public Pair<B, A> swap() {
        return new Pair<>(second, first);
    }

    @Override
    public String toString() {
        return "(" + first + ", " + second + ")";
    }

    public static <T extends Comparable<T>>
    Pair<T, T> minMax(List<T> list) {

        if (list == null || list.isEmpty()) {
            return null;
        }

        T min = list.get(0);
        T max = list.get(0);

        for (T item : list) {

            if (item.compareTo(min) < 0) {
                min = item;
            }

            if (item.compareTo(max) > 0) {
                max = item;
            }
        }

        return new Pair<>(min, max);
    }

    public static <K, V>
    Pair<K, V> fromMapEntry(
            Map.Entry<K, V> entry
    ) {
        return new Pair<>(
                entry.getKey(),
                entry.getValue()
        );
    }
}