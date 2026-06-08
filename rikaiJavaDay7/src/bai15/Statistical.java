package bai15;

import java.util.List;
import java.util.Map;

public class Statistical {
    private Map<Boolean, List<Integer>> map;
    private long quantity;
    public Statistical(Map<Boolean, List<Integer>> map, long quantity) {
        this.map = map;
        this.quantity = quantity;

    }
}
