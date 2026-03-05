package opgave02.models;

import java.util.Iterator;

public class RangeIterator implements Iterator<Integer> {
    private int current;
    private int end;

    public RangeIterator(int start, int end) {
        this.current = start;
        this.end = end;
    }

    @Override
    public boolean hasNext() {
        return current<=end;
    }

    @Override
    public Integer next() {
        return current++;
    }
}
