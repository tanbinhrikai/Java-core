package bai20;

public record Student(
        String id,
        String name,
        String major,
        double math,
        double physics,
        double chemistry,
        double avg
) {}