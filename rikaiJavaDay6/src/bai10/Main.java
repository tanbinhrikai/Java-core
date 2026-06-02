package bai10;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Main {
    public static TreeMap<String, List<String>> danhBa = new TreeMap<>();
    public static void main(String[] args) {
        addContact("An", "0901234567");
        addContact("Binh", "0912345678");
        addContact("An", "0987654321");

        System.out.println(" Danh ba ");
        duyet();

        Main m = new Main();

        System.out.println("\n Tim An ");
        System.out.println(m.findByname("An"));

        System.out.println("\n Tim John (chua co) ");
        System.out.println(m.findByname("John"));



    }
    public static void  addContact(String ten, String sdt){
        danhBa.computeIfAbsent(ten, k -> new ArrayList<>())
                .add(sdt);

    }

    public List<String> findByname(String name){
        return danhBa.get(name);

    }

    public static void duyet(){
        for (Map.Entry<String, List<String>> entry : danhBa.entrySet()) {
            System.out.println("so dien thoai cua " + entry.getKey());
            for (String sdt : entry.getValue()) {
                System.out.println(sdt);
            }
        }
    }

}
