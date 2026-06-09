package day7.bai1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        var list = new ArrayList<String>();
        var map = new HashMap<String, List<Integer>>();
        map.put("A" ,List.of(1,23));
        for(var entry : map.entrySet()) {
            System.out.println(entry);
        }

        var obj = new Object(){
            int x = 1;
            String name = "Java";
        };
        System.out.println(obj.x);
        System.out.println(obj.name);
        var field =  10; // (Trong class, khong phai method)
//        var param; // => compile error

    }
}
