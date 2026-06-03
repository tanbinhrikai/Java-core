package bai16;

import java.util.Iterator;

public class Range implements Iterable<Integer> {
    private int start;
    private int end;
    private int step;
    public Range(int start, int end, int step) {
        this.start = start;
        this.end = end;
        this.step = step;
    }
    @Override
    public Iterator<Integer> iterator() {
        return new RangeIterator(start, end, step);
    }
}
