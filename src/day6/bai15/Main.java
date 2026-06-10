package day6.bai15;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void adddMon(
            Map<String, Map<Integer, List<String>>> lichHoc,
            String tuan,
            int ngay,
            String mon) {

        lichHoc.computeIfAbsent(
                tuan,
                k -> new HashMap<>()).computeIfAbsent(
                ngay,
                k -> new ArrayList<>()).add(mon);
    }

    public static List<String> getMons(Map<String, Map<Integer, List<String>>> lichHoc,
                                       String tuan,
                                       int ngay) {
        var result = lichHoc.get(tuan).get(ngay);
        return result;
    }

    public static int countMonInWeek(
            Map<String, Map<Integer, List<String>>> lichHoc,
            String tuan, String mon) {
        Map<Integer, List<String>> monInWeek = lichHoc.get(tuan);
        return (int) monInWeek.values()
                .stream()
                .flatMap(List::stream)
                .filter(item -> item.equalsIgnoreCase(mon))
                .count();
    }

    public static void printTimetable(Map<String, Map<Integer, List<String>>> lichHoc) {
        System.out.println("LichHoc:");
        lichHoc.entrySet()
                .stream().sorted(Map.Entry.comparingByKey())
                .forEach(tuan -> {
                    String tenTuan = tuan.getKey();
                    Map<Integer, List<String>> lichTrongTuan = tuan.getValue();

                    System.out.println("+" + tenTuan.toUpperCase());
                    lichTrongTuan.entrySet().stream().sorted(Map.Entry.comparingByKey())
                            .forEach(thuEntry -> {
                                Integer thu = thuEntry.getKey();
                                List<String> danhSachMon = thuEntry.getValue();

                                System.out.println("   --> Thứ " + thu + ": " + danhSachMon);
                            });
                });

    }

    public static void main(String[] args) {
        Map<String, Map<Integer, List<String>>> lichHoc = new HashMap<>();
        adddMon(lichHoc, "tuan 1", 2, "Java");
        adddMon(lichHoc, "tuan 1", 2, "English");

        adddMon(lichHoc, "tuan 1", 4, "Java");
        adddMon(lichHoc, "tuan 1", 4, "Math");

        adddMon(lichHoc, "tuan 1", 6, "Python");

        adddMon(lichHoc, "tuan 2", 3, "Java");
        adddMon(lichHoc, "tuan 2", 5, "Python");


        adddMon(lichHoc, "tuan 3", 2, "C#");


        System.out.println(getMons(lichHoc, "tuan 1", 6));

        System.out.println(countMonInWeek(lichHoc, "tuan 1", "java"));
        printTimetable(lichHoc);
    }
}
