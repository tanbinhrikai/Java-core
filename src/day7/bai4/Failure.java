package day7.bai4;

public record Failure<T>(String error) implements Result<T> {
}
