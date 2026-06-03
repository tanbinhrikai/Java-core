package bai3;

public record Range(int start, int end) {
    public boolean contains(int x) {
        return x >= start && x <= end;
    }
}
