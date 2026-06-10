package day6.bai20;

import java.util.*;

public class TaskManager {

    // 4 collections song song — mỗi cái phục vụ một loại truy vấn
    private final Map<String, Task> idMap = new HashMap<>();
    private final PriorityQueue<Task> priorityQueue = new PriorityQueue<>();
    private final Map<Priority, List<Task>> byPriority = new EnumMap<>(Priority.class);
    private final Map<String, List<Task>> byTag = new HashMap<>();

    private final Map<Status, List<Task>> byStatus = new EnumMap<>(Status.class);

    // Khởi tạo các list rỗng cho mỗi enum value
    public TaskManager() {
        for (Priority p : Priority.values()) {
            byPriority.put(p, new ArrayList<>());
        }
        for (Status s : Status.values()) {
            byStatus.put(s, new ArrayList<>());
        }
    }

    // ----------------------------------------------------------
    // addTask — thêm vào TẤT CẢ collections cùng lúc
    // ----------------------------------------------------------
    public void addTask(Task task) {
        // Kiểm tra trùng ID
        if (idMap.containsKey(task.getId())) {
            throw new IllegalArgumentException("Task ID đã tồn tại: " + task.getId());
        }

        idMap.put(task.getId(), task);                          // O(1)
        priorityQueue.offer(task);                              // O(log n)
        byPriority.get(task.getPriority()).add(task);           // O(1)
        byStatus.get(task.getStatus()).add(task);               // O(1)

        // Mỗi tag → thêm task vào list tương ứng
        for (String tag : task.getTags()) {
            byTag.computeIfAbsent(tag, k -> new ArrayList<>()).add(task);  // O(1)
        }

        System.out.println("✅ Thêm task: " + task);
    }

    // ----------------------------------------------------------
    // updateStatus — cập nhật status, đồng bộ byStatus map
    // ----------------------------------------------------------
    public void updateStatus(String taskId, Status newStatus) {
        Task task = idMap.get(taskId);  // O(1)
        if (task == null) {
            throw new NoSuchElementException("Không tìm thấy task: " + taskId);
        }

        // Xóa khỏi status cũ
        byStatus.get(task.getStatus()).remove(task);

        // Cập nhật status mới
        task.setStatus(newStatus);
        byStatus.get(newStatus).add(task);

        System.out.println("🔄 Cập nhật " + taskId + " → " + newStatus);
    }

    // ----------------------------------------------------------
    // Các phương thức truy vấn
    // ----------------------------------------------------------

    // Lấy task theo ID — O(1)
    public Task getById(String taskId) {
        return idMap.get(taskId);
    }

    // Lấy tất cả task theo priority — O(1) lookup
    public List<Task> getByPriority(Priority priority) {
        return Collections.unmodifiableList(
                byPriority.getOrDefault(priority, Collections.emptyList())
        );
    }

    // Lấy tất cả task theo status — O(1) lookup
    public List<Task> getByStatus(Status status) {
        return Collections.unmodifiableList(
                byStatus.getOrDefault(status, Collections.emptyList())
        );
    }

    // Tìm kiếm theo tag — O(1) lookup
    public List<Task> searchByTag(String tag) {
        return Collections.unmodifiableList(
                byTag.getOrDefault(tag, Collections.emptyList())
        );
    }

    // Lấy task ưu tiên cao nhất (không xóa khỏi queue) — O(1)
    public Task peekMostUrgent() {
        return priorityQueue.peek();
    }

    // Lấy và XÓA task ưu tiên cao nhất khỏi queue — O(log n)
    // Lưu ý: cần đồng bộ lại các collections khác nếu dùng poll()
    public Task pollMostUrgent() {
        Task task = priorityQueue.poll();
        if (task != null) {
            idMap.remove(task.getId());
            byPriority.get(task.getPriority()).remove(task);
            byStatus.get(task.getStatus()).remove(task);
            for (String tag : task.getTags()) {
                List<Task> tagList = byTag.get(tag);
                if (tagList != null) tagList.remove(task);
            }
        }
        return task;
    }

    // Xem toàn bộ tasks theo thứ tự ưu tiên
    public void printAllByPriority() {
        // Clone queue để không làm mất data gốc
        PriorityQueue<Task> clone = new PriorityQueue<>(priorityQueue);
        System.out.println("\n📋 Tất cả tasks theo độ ưu tiên:");
        while (!clone.isEmpty()) {
            System.out.println("  " + clone.poll());
        }
    }
}