package bai16;

import java.util.Iterator;

public class RangeIterator implements Iterator<Integer> {
    private int current;
    private int end;
    private int step;

    public RangeIterator(int current, int end, int step) {
        this.current = current;
        this.end = end;
        this.step = step;
    }

    @Override
    public boolean hasNext() {
       if(step > 0){
           return  current <=end;
       }
       return  current >= end;
    }

    @Override
    public Integer next() {
        int value = current;
        current += step;
        return value;
    }
}
