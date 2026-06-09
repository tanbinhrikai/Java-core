package day7.bai1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        var list = new ArrayList<String>();
        var map = new HashMap<String, List<Integer>>();
        for(var entry : map.entrySet()) {

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
