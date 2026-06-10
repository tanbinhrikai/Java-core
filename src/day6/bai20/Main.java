package day6.bai20;

import java.time.LocalDate;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        TaskManager manager = new TaskManager();

        // --- Thêm tasks ---
        manager.addTask(new Task(
                "T001", "Fix critical bug",
                Priority.HIGH, Status.IN_PROGRESS,
                LocalDate.of(2025, 6, 15),
                List.of("java", "backend", "bug")
        ));

        manager.addTask(new Task(
                "T002", "Write unit tests",
                Priority.MEDIUM, Status.TODO,
                LocalDate.of(2025, 6, 20),
                List.of("java", "testing")
        ));

        manager.addTask(new Task(
                "T003", "Deploy to production",
                Priority.HIGH, Status.TODO,
                LocalDate.of(2025, 6, 16),
                List.of("devops", "backend")
        ));

        manager.addTask(new Task(
                "T004", "Update documentation",
                Priority.LOW, Status.TODO,
                LocalDate.of(2025, 6, 30),
                List.of("docs")
        ));

        // --- Truy vấn ---
        System.out.println("\n🔍 getByPriority(HIGH):");
        manager.getByPriority(Priority.HIGH)
                .forEach(t -> System.out.println("  " + t));

        System.out.println("\n🔍 searchByTag(\"java\"):");
        manager.searchByTag("java")
                .forEach(t -> System.out.println("  " + t));

        System.out.println("\n⚡ Task ưu tiên nhất: " + manager.peekMostUrgent());

        // --- Cập nhật status ---
        manager.updateStatus("T001", Status.DONE);

        System.out.println("\n🔍 getByStatus(DONE):");
        manager.getByStatus(Status.DONE)
                .forEach(t -> System.out.println("  " + t));

        // --- In toàn bộ theo thứ tự ưu tiên ---
        manager.printAllByPriority();
    }
}
