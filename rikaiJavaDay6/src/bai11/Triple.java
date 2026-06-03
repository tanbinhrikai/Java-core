package bai11;

import java.util.Arrays;
import java.util.List;

public class Triple <A,B,C>{
    private A first;
    private B second;
    private C third;


    public List<Object> toList(){
        return Arrays.asList(first, second, third);
    }
}
