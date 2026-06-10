package day6.bai20;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Task implements Comparable<Task> {
    private final String id;
    private String title;
    private Priority priority;
    private Status status;
    private LocalDate deadline;
    private List<String> tags;

    public Task(String id, String title, Priority priority, Status status,
                LocalDate deadline, List<String> tags) {
        this.id = id;
        this.title = title;
        this.priority = priority;
        this.status = status;
        this.deadline = deadline;
        this.tags = new ArrayList<>(tags);
    }

    // PriorityQueue dùng compareTo để xếp thứ tự
    // So sánh priority trước, nếu bằng thì so sánh deadline
    @Override
    public int compareTo(Task other) {
        int cmp = Integer.compare(this.priority.getOrder(), other.priority.getOrder());
        if (cmp != 0) return cmp;
        if (this.deadline == null && other.deadline == null) return 0;
        if (this.deadline == null) return 1;
        if (other.deadline == null) return -1;
        return this.deadline.compareTo(other.deadline);
    }

    // Getters
    public String getId()         { return id; }
    public String getTitle()      { return title; }
    public Priority getPriority() { return priority; }
    public Status getStatus()     { return status; }
    public LocalDate getDeadline(){ return deadline; }
    public List<String> getTags() { return Collections.unmodifiableList(tags); }

    // Setters (chỉ những field có thể thay đổi)
    public void setStatus(Status status) { this.status = status; }
    public void setPriority(Priority priority) { this.priority = priority; }

    @Override
    public String toString() {
        return String.format("[%s] %s | %s | %s | tags=%s",
                id, title, priority, status, tags);
    }
}