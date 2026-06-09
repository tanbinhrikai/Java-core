package day7.bai16;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        // sequence collection là sẽ có first có last
        SequencedCollection<String> list = new ArrayList<>(List.of("A","B","C"));

        System.out.println(list.getFirst());
        System.out.println(list.getLast());
        list.addFirst("M");
        list.addLast("L");
        System.out.println(list);
        list.removeFirst();
        list.removeLast();
        System.out.println(list);
        System.out.println(list.reversed());

        SequencedSet<String> set = new LinkedHashSet<>(List.of("X", "Y", "Z"));
        System.out.println(set);
        System.out.println(set.getLast());

        SequencedMap<String, Integer> map = new LinkedHashMap<>();
        map.put("Ba", 3);
        map.put("Một", 1);
        map.put("Hai", 2);

        System.out.println(map);

    }
}
