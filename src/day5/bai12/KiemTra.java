package day5.bai12;

@FunctionalInterface
public interface KiemTra<T> {
    boolean test(T item);

    default KiemTra<T> and(KiemTra<T> other) {
        return (T item) -> this.test(item) && other.test(item);
    }

    default KiemTra<T> or(KiemTra<T> other) {
        return (T item) -> this.test(item) || other.test(item);
    }

    default KiemTra<T> negate() {
        return (T item) -> !this.test(item);
    }
}
