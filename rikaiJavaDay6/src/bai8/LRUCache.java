package bai8;

import java.util.Iterator;
import java.util.LinkedHashMap;

public class LRUCache {

    private final int capacity;

    private final LinkedHashMap<Integer, String> cache;

    public LRUCache(int capacity) {
        this.capacity = capacity;
        this.cache = new LinkedHashMap<>();
    }

    public void put(int key, String value) {

        if (cache.containsKey(key)) {
            cache.remove(key);
        }

        if (cache.size() == capacity) {

            Iterator<Integer> iterator =
                    cache.keySet().iterator();

            cache.remove(iterator.next());
        }

        cache.put(key, value);
    }

    public String get(int key) {

        if (!cache.containsKey(key)) {
            return null;
        }

        String value = cache.get(key);

        cache.remove(key);
        cache.put(key, value);

        return value;
    }

    public void printCache() {
        System.out.println(cache);
    }
}