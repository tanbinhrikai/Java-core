package day6.bai17;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Multimap<String, String> sinhViens = new Multimap<>();
        sinhViens.put("CNTT", "An");
        sinhViens.put("CNTT", "Chi");
        sinhViens.put("CNTT", "MInh");
        sinhViens.put("Kinh te", "Hoa");

        System.out.println(sinhViens.keys());
        System.out.println(sinhViens.get("CNTT"));;
        sinhViens.removeValue("CNTT", "MInh");
        System.out.println(sinhViens.values());;

    }
}
