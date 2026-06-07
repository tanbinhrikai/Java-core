package bai14;

import java.util.*;

public class Main {

    private static final Map<String, List<String>> graph =
            new HashMap<>();

    public static void main(String[] args) {

        addEdge("A", "B");
        addEdge("A", "C");
        addEdge("B", "D");
        addEdge("C", "D");
        addEdge("D", "E");

        System.out.println(hasPath("A", "E"));

        System.out.println(shortestPath("A", "E"));

        System.out.println(neighbors("A"));
    }

    public static void addEdge(String from, String to) {
        graph
                .computeIfAbsent(from, k -> new ArrayList<>())
                .add(to);
    }

    public static boolean hasPath(String start, String end) {

        Queue<String> queue = new ArrayDeque<>();
        Set<String> visited = new HashSet<>();

        queue.offer(start);
        visited.add(start);

        while (!queue.isEmpty()) {

            String current = queue.poll();

            if (current.equals(end)) {
                return true;
            }

            List<String> neighbors =
                    graph.getOrDefault(current, List.of());

            for (String neighbor : neighbors) {

                if (!visited.contains(neighbor)) {
                    visited.add(neighbor);
                    queue.offer(neighbor);
                }
            }
        }

        return false;
    }

    public static List<String> shortestPath(
            String start,
            String end
    ) {

        Queue<String> queue = new ArrayDeque<>();
        Set<String> visited = new HashSet<>();
        Map<String, String> parent = new HashMap<>();

        queue.offer(start);
        visited.add(start);

        while (!queue.isEmpty()) {

            String current = queue.poll();

            if (current.equals(end)) {
                break;
            }

            List<String> neighbors =
                    graph.getOrDefault(current, List.of());

            for (String neighbor : neighbors) {

                if (!visited.contains(neighbor)) {

                    visited.add(neighbor);
                    parent.put(neighbor, current);

                    queue.offer(neighbor);
                }
            }
        }

        if (!parent.containsKey(end) && !start.equals(end)) {
            return Collections.emptyList();
        }

        List<String> path = new ArrayList<>();
        String current = end;

        while (current != null) {
            path.add(current);
            current = parent.get(current);
        }

        Collections.reverse(path);
        return path;
    }

    public static List<String> neighbors(String node) {
        return graph.getOrDefault(node, List.of());
    }


    public static Set<String> mutualFriends(String user1, String user2) {

        Set<String> set1 = new HashSet<>(
                graph.getOrDefault(user1, List.of())
        );

        Set<String> set2 = new HashSet<>(
                graph.getOrDefault(user2, List.of())
        );

        set1.retainAll(set2);

        return set1;
    }
}