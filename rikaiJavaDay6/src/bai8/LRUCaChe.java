package bai8;

import java.util.*;

public class LRUCaChe {
    private int capacity;
    private LinkedHashMap<Integer,String> map;
    public LRUCaChe(int capacity) {
        this.capacity = capacity;
        this.map = new LinkedHashMap<Integer,String>() ;
    }


    public void put(int key, String value) {
        if (map.containsKey(key)) {
            map.remove(key);
        }

        if (map.size() == capacity) {
            Iterator<Integer> it = map.keySet().iterator();
            map.remove(it.next());
        }

        map.put(key, value);




    }

    public String get(int key) {
        if (!map.containsKey(key)) {
            return null;
        }

        String value = map.get(key);

        map.remove(key);
        map.put(key, value);

        return value;
    }
}
