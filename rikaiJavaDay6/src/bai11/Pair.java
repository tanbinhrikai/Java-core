package bai11;

import java.util.List;
import java.util.Map;

public class Pair <A,B>{
    private A first;
    private B second;
    public Pair(A a, B b){
        first = a;
        second = b;
    }

    public String toString(){
        return first.toString() + " " + second.toString();
    }


    public Pair<B,A> swap(){
        return new Pair<B,A>(second,first);
    }

    public static <T extends Comparable<T>> Pair<T,T> minMax(List<T> list){
        if(list.isEmpty()) return null;
        T min = list.get(0);
        T max  = list.get(0);
        for(T t : list){
            if(t.compareTo(min) < 0) {
                min = t;
            }
            if(t.compareTo(max) > 0) {
                max = t;
            }
        }
        return new Pair<T,T>(min,max);

    }
    public static <K,V> Pair<K,V> fromMapEnt(Map<K,V> map){
        if(map.isEmpty()) return null;
        K key = map.keySet().iterator().next();
        V value = map.get(key);
        return new Pair<K,V>(key,value);
    }
}
