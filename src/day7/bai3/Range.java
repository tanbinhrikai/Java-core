package day7.bai3;

public record Range(int start, int end) {
    public boolean contains (int n) {
        return n >= start && n <= end;
    }
}
