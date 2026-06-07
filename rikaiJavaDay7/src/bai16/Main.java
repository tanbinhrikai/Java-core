package bai16;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<String> list =
                new ArrayList<>(
                        List.of("A", "B", "C")
                );

        System.out.println("First: " + list.getFirst());
        System.out.println("Last : " + list.getLast());

        System.out.println(
                "Reversed: " + list.reversed()
        );


        LinkedList<String> linked =
                new LinkedList<>(
                        List.of("A", "B", "C")
                );

        linked.addFirst("Z");
        linked.addLast("D");

        System.out.println(linked);

        linked.removeFirst();
        linked.removeLast();

        System.out.println(linked);



        LinkedHashSet<String> set =
                new LinkedHashSet<>(
                        List.of("A", "B", "C")
                );

        System.out.println(
                "Set first = " + set.getFirst()
        );

        System.out.println(
                "Set last = " + set.getLast()
        );

        System.out.println(
                "Set reversed = " + set.reversed()
        );


        LinkedHashMap<Integer, String> map =
                new LinkedHashMap<>();

        map.put(1, "Java");
        map.put(2, "Spring");
        map.put(3, "Docker");

        System.out.println(
                "First Entry = "
                        + map.firstEntry()
        );

        System.out.println(
                "Last Entry = "
                        + map.lastEntry()
        );


        System.out.println(
                "Keys = "
                        + map.sequencedKeySet()
        );

        System.out.println(
                "Reversed Keys = "
                        + map.reversed()
                        .sequencedKeySet()
        );

    }
}
