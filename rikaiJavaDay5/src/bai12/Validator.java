package bai12;

@FunctionalInterface
public interface Validator<T> {

    boolean test(T item);

    default Validator<T> and(Validator<T> other) {
        return item -> test(item) && other.test(item);
    }

    default Validator<T> or(Validator<T> other) {
        return item -> test(item) || other.test(item);
    }

    default Validator<T> negate() {
        return item -> !test(item);
    }
}