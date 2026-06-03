package bai1;

import java.util.HashMap;
import java.util.List;

public class Main {
//    private var a = 10; => khong duoc
    public static void main(String[] args) {
        var  a = 10;
        var map = new HashMap<String, List<Integer>>();
        for (var entry : map.entrySet()) {
            System.out.println(entry.getKey());
        }
    }


    // sex loix vif var khong the lam parram
//    public void testVar(var number){
//        System.out.println(number);
//    }
}
