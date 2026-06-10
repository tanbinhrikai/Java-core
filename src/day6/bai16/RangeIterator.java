package day6.bai16;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class RangeIterator implements Iterator<Integer> {
    private final int end;
    private final int step;
    private int current;

    public RangeIterator(int start, int end, int step) {
        this.current = start;
        this.end = end;
        this.step = step;
    }

    @Override
    public boolean hasNext() {
        if (step > 0) {
            return current <= end; // Bước nhảy dương: còn chạy khi chưa vượt quá end
        } else {
            return current >= end; // Bước nhảy âm: còn chạy khi chưa nhỏ hơn end
        }
    }

    @Override
    public Integer next() {
        if (!hasNext()) {
            throw new NoSuchElementException("Không còn phần tử nào trong Range!");
        }
        int valueToReturn = current;
        current += step; // Tiến (hoặc lùi) trạng thái hiện tại cho lần gọi sau
        return valueToReturn;
    }
}
