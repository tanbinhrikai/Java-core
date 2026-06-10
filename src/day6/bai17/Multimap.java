package day6.bai17;

import java.util.*;

public class Multimap<K, V> {
    private final Map<K, List<V>> map = new HashMap<>();

    public void put(K key, V value) {
        // kiem tra chua co key thi tao moi value
        // co key roi thi tra ve value sao do add them vao list
        map.computeIfAbsent(key, k -> new ArrayList<>()).add(value);
    }

    public List<V> get(K key) {
        return map.get(key);
    }

    public void removeValue(K key, V value) {
        List<V> list = map.get(key);
        list.remove(value);
    }

    public Set<K> keys() {
        return map.keySet();
    }

    public List<V> values() {
        return map.values().stream()
                .flatMap(List::stream)
                .toList();
    }

}
