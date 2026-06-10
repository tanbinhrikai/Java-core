package day6.bai14;

import java.util.*;

/**
 * BÀI 14 ★★★ - Đồ thị có hướng dùng HashMap
 * Graph: A->B, A->C, B->D, C->D, D->E
 * hasPath(A,E) = true
 * shortestPath(A,E) = [A, B, D, E]
 * neighbors(A) = [B, C]
 */
public class Graph {

    // Danh sách kề: mỗi đỉnh -> danh sách các đỉnh kề
    private Map<String, List<String>> adjList;

    public Graph() {
        this.adjList = new HashMap<>();
    }

    // ─────────────────────────────────────────
    //  1. addEdge: thêm cạnh có hướng from -> to
    // ─────────────────────────────────────────
    public void addEdge(String from, String to) {
        // Tạo list nếu chưa có
        adjList.putIfAbsent(from, new ArrayList<>());
        adjList.putIfAbsent(to,   new ArrayList<>()); // đảm bảo "to" cũng tồn tại
        adjList.get(from).add(to);
    }

    // ─────────────────────────────────────────
    //  2. neighbors: trả về danh sách đỉnh kề
    // ─────────────────────────────────────────
    public List<String> neighbors(String node) {
        return adjList.getOrDefault(node, Collections.emptyList());
    }

    // ─────────────────────────────────────────
    //  3. hasPath: BFS tìm đường đi từ src -> dst
    // ─────────────────────────────────────────
    public boolean hasPath(String src, String dst) {
        if (!adjList.containsKey(src) || !adjList.containsKey(dst)) return false;
        if (src.equals(dst)) return true;

        Set<String>    visited = new HashSet<>();
        Queue<String>  queue   = new LinkedList<>();

        queue.offer(src);
        visited.add(src);

        while (!queue.isEmpty()) {
            String curr = queue.poll();

            for (String neighbor : neighbors(curr)) {
                if (neighbor.equals(dst)) return true;   // tìm thấy!

                if (!visited.contains(neighbor)) {
                    visited.add(neighbor);
                    queue.offer(neighbor);
                }
            }
        }
        return false; // không tìm thấy đường đi
    }

    // ─────────────────────────────────────────
    //  4. shortestPath: BFS + parent map để reconstruct path
    //     Trả về List<String> (đường đi ngắn nhất)
    //     Trả về null nếu không có đường đi
    // ─────────────────────────────────────────
    public List<String> shortestPath(String src, String dst) {
        if (!adjList.containsKey(src) || !adjList.containsKey(dst)) return null;
        if (src.equals(dst)) return Collections.singletonList(src);

        // parent[node] = đỉnh trước đó trên đường đi ngắn nhất
        Map<String, String> parent  = new HashMap<>();
        Set<String>         visited = new HashSet<>();
        Queue<String>       queue   = new LinkedList<>();

        queue.offer(src);
        visited.add(src);
        parent.put(src, null); // src không có parent

        while (!queue.isEmpty()) {
            String curr = queue.poll();

            for (String neighbor : neighbors(curr)) {
                if (!visited.contains(neighbor)) {
                    visited.add(neighbor);
                    parent.put(neighbor, curr); // lưu parent để trace lại

                    if (neighbor.equals(dst)) {
                        return reconstructPath(parent, src, dst); // tìm thấy → dựng path
                    }

                    queue.offer(neighbor);
                }
            }
        }
        return null; // không có đường đi
    }

    // Helper: dựng lại đường đi từ parent map (đi ngược từ dst về src)
    private List<String> reconstructPath(Map<String, String> parent, String src, String dst) {
        LinkedList<String> path = new LinkedList<>();
        String curr = dst;

        while (curr != null) {
            path.addFirst(curr);   // thêm vào đầu để đảo thứ tự
            curr = parent.get(curr);
        }
        return path;
    }

    // ─────────────────────────────────────────
    //  5. commonFriends: tìm bạn chung giữa 2 người
    //     (dùng cho mạng xã hội)
    // ─────────────────────────────────────────
    public List<String> commonFriends(String person1, String person2) {
        Set<String> friends1 = new HashSet<>(neighbors(person1));
        Set<String> friends2 = new HashSet<>(neighbors(person2));

        // Giao của hai tập
        friends1.retainAll(friends2);
        return new ArrayList<>(friends1);
    }

    // ─────────────────────────────────────────
    //  In đồ thị ra console
    // ─────────────────────────────────────────
    public void printGraph() {
        System.out.println("=== Đồ thị ===");
        for (Map.Entry<String, List<String>> entry : adjList.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
        System.out.println();
    }

    // ═══════════════════════════════════════════
    //  DEMO CHÍNH
    // ═══════════════════════════════════════════
    public static void main(String[] args) {
        System.out.println("╔══════════════════════════════════════╗");
        System.out.println("║     BÀI 14: Graph với HashMap        ║");
        System.out.println("╚══════════════════════════════════════╝\n");

        // ── Demo 1: Đồ thị cơ bản ─────────────────
        System.out.println("── DEMO 1: Đồ thị cơ bản ──────────────");
        Graph g = new Graph();
        g.addEdge("A", "B");
        g.addEdge("A", "C");
        g.addEdge("B", "D");
        g.addEdge("C", "D");
        g.addEdge("D", "E");
        g.printGraph();

        // neighbors
        System.out.println("neighbors(A) = " + g.neighbors("A"));       // [B, C]
        System.out.println("neighbors(D) = " + g.neighbors("D"));       // [E]
        System.out.println();

        // hasPath
        System.out.println("hasPath(A, E)  = " + g.hasPath("A", "E")); // true
        System.out.println("hasPath(A, A)  = " + g.hasPath("A", "A")); // true
        System.out.println("hasPath(E, A)  = " + g.hasPath("E", "A")); // false (có hướng!)
        System.out.println("hasPath(B, C)  = " + g.hasPath("B", "C")); // false
        System.out.println();

        // shortestPath
        List<String> path1 = g.shortestPath("A", "E");
        System.out.println("shortestPath(A, E) = " + path1);            // [A, B, D, E]
        System.out.println("  length = " + (path1 != null ? path1.size() - 1 : "N/A"));

        List<String> path2 = g.shortestPath("A", "D");
        System.out.println("shortestPath(A, D) = " + path2);            // [A, B, D] hoặc [A, C, D]

        List<String> path3 = g.shortestPath("E", "A");
        System.out.println("shortestPath(E, A) = " + path3);            // null

        System.out.println();

        // ── Demo 2: Mạng xã hội ────────────────────
        System.out.println("── DEMO 2: Mạng xã hội ─────────────────");
        Graph social = new Graph();

        // Quan hệ bạn bè (có hướng: A quen B không đồng nghĩa B quen A)
        social.addEdge("Alice",   "Bob");
        social.addEdge("Alice",   "Charlie");
        social.addEdge("Alice",   "David");
        social.addEdge("Bob",     "Charlie");
        social.addEdge("Bob",     "Eve");
        social.addEdge("Charlie", "David");
        social.addEdge("Charlie", "Frank");
        social.addEdge("David",   "Eve");
        social.addEdge("Eve",     "Frank");
        social.addEdge("Frank",   "Alice");
        social.printGraph();

        // Bạn chung của Alice và Bob
        List<String> common1 = social.commonFriends("Alice", "Bob");
        System.out.println("Bạn chung của Alice và Bob    : " + common1);  // [Charlie]

        // Có đường nối từ Alice đến Frank không?
        System.out.println("hasPath(Alice, Frank)         : " + social.hasPath("Alice", "Frank"));
        System.out.println("shortestPath(Alice, Frank)    : " + social.shortestPath("Alice", "Frank"));

        // 6 degrees of separation: Bob -> Alice
        System.out.println("shortestPath(Bob, Alice)      : " + social.shortestPath("Bob", "Alice"));

        System.out.println("\n✅ Hoàn thành!");
    }
}
