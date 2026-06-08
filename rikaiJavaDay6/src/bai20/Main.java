package bai20;

import java.time.LocalDate;
import java.util.*;

public class Main {

    enum Priority {
        HIGH, MEDIUM, LOW
    }

    enum Status {
        TODO, IN_PROGRESS, DONE
    }

    static class Task {
        String id;
        String title;
        Priority priority;
        Status status;
        LocalDate deadline;
        List<String> tags;

        public Task(String id, String title, Priority priority, Status status,
                    LocalDate deadline, List<String> tags) {
            this.id = id;
            this.title = title;
            this.priority = priority;
            this.status = status;
            this.deadline = deadline;
            this.tags = tags;
        }

        @Override
        public String toString() {
            return id + " " + title + " (" + priority + ", " + status + ")";
        }
    }

    static class TaskManager {

        private Map<String, Task> idMap = new HashMap<>();

        private PriorityQueue<Task> priorityQueue =
                new PriorityQueue<>((a, b) -> b.priority.compareTo(a.priority));

        private Map<Priority, List<Task>> byPriority = new HashMap<>();

        private Map<String, List<Task>> byTag = new HashMap<>();

        public void addTask(Task task) {
            idMap.put(task.id, task);

            priorityQueue.offer(task);

            byPriority.computeIfAbsent(task.priority, k -> new ArrayList<>()).add(task);

            for (String tag : task.tags) {
                byTag.computeIfAbsent(tag, k -> new ArrayList<>()).add(task);
            }
        }

        public void updateStatus(String id, Status newStatus) {
            Task task = idMap.get(id);
            if (task != null) {
                task.status = newStatus;
            }
        }

        public List<Task> getByPriority(Priority priority) {
            return byPriority.getOrDefault(priority, new ArrayList<>());
        }

        public List<Task> searchByTag(String tag) {
            return byTag.getOrDefault(tag, new ArrayList<>());
        }

        public List<Task> getByStatus(Status status) {
            List<Task> result = new ArrayList<>();
            for (Task t : idMap.values()) {
                if (t.status == status) {
                    result.add(t);
                }
            }
            return result;
        }

        public void printPriorityQueue() {
            PriorityQueue<Task> copy = new PriorityQueue<>(priorityQueue);
            while (!copy.isEmpty()) {
                System.out.println(copy.poll());
            }
        }
    }

    public static void main(String[] args) {

        TaskManager tm = new TaskManager();

        tm.addTask(new Task(
                "T001",
                "Fix bug",
                Priority.HIGH,
                Status.IN_PROGRESS,
                LocalDate.now(),
                Arrays.asList("java", "backend")
        ));

        tm.addTask(new Task(
                "T002",
                "Write docs",
                Priority.MEDIUM,
                Status.TODO,
                LocalDate.now().plusDays(2),
                Arrays.asList("docs", "api")
        ));

        tm.addTask(new Task(
                "T003",
                "Optimize DB",
                Priority.HIGH,
                Status.TODO,
                LocalDate.now().plusDays(1),
                Arrays.asList("java", "database")
        ));

        System.out.println("HIGH priority:");
        System.out.println(tm.getByPriority(Priority.HIGH));

        System.out.println("\nSearch tag 'java':");
        System.out.println(tm.searchByTag("java"));

        tm.updateStatus("T001", Status.DONE);

        System.out.println("\nDONE tasks:");
        System.out.println(tm.getByStatus(Status.DONE));

        System.out.println("\nPriority Queue:");
        tm.printPriorityQueue();
    }
}