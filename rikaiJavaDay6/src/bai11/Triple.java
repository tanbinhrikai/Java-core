package bai11;

import java.util.List;

public class Triple<A, B, C> {

    private final A first;
    private final B second;
    private final C third;

    public Triple(
            A first,
            B second,
            C third
    ) {
        this.first = first;
        this.second = second;
        this.third = third;
    }

    public List<Object> toList() {
        return List.of(
                first,
                second,
                third
        );
    }

    @Override
    public String toString() {
        return "("
                + first + ", "
                + second + ", "
                + third + ")";
    }
}