package bai17;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Multimap <K,V>{
    private Map<K, List<V>> map = new HashMap<>();


    public void put(K key, V value) {
        map.computeIfAbsent(key, k -> new ArrayList<>())
                .add(value);
    }

    public List<V> get(K key) {
        return map.getOrDefault(key, new ArrayList<>());
    }

    public void removeValue(K key, V value) {
        if(!map.containsKey(key)) {
            System.out.println("khong ton tai key muon xoa");
            return;
        }
        List<V> vs = map.get(key);
        if(vs.contains(value)) {
            vs.remove(value);
        }

    }

    public List<K> getKeys() {
        return new ArrayList<>(map.keySet());
    }

    public List<V> getValues() {
        return  map.values()
                .stream()
                .flatMap(List::stream)
                .collect(Collectors.toList());

    }
}
