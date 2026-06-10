package day6.bai16;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// implement Iterable de co the su dung for each
public class Range implements Iterable<Integer>{
    int start;
    int end;
    int step;

    public Range(int start, int end, int step) {
        this.start = start;
        this.end = end;
        this.step = step;
    }

    @Override
    public Iterator<Integer> iterator() {
        return new RangeIterator(start, end, step);
    }

    public List<Integer> toList() {
        List<Integer> res = new ArrayList<>();
        for(int n : this) {
            res.add(n);
        }
        return res;
    }
}
