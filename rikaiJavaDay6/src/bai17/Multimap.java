package bai17;

import java.util.*;
import java.util.stream.Collectors;

public class Multimap<K, V> {

    private final Map<K, List<V>> map = new HashMap<>();

    public void put(K key, V value) {
        map.computeIfAbsent(key, k -> new ArrayList<>())
                .add(value);
    }

    public List<V> get(K key) {
        return map.getOrDefault(key, List.of());
    }

    public void removeValue(K key, V value) {

        List<V> values = map.get(key);

        if (values == null) return;

        values.remove(value);

        if (values.isEmpty()) {
            map.remove(key);
        }
    }

    public Set<K> keys() {
        return map.keySet();
    }

    public List<V> values() {
        return map.values()
                .stream()
                .flatMap(List::stream)
                .collect(Collectors.toList());
    }
}