package bai15;

import java.util.*;
import java.util.stream.Collectors;

public class Main {

    private static final Map<String, Map<Integer, List<String>>> schedule = new HashMap<>();

    public static void main(String[] args) {

        addMon("Tuan1", 2, "Java");
        addMon("Tuan1", 2, "English");
        addMon("Tuan1", 4, "Java");
        addMon("Tuan1", 4, "Math");
        addMon("Tuan1", 6, "Python");

        addMon("Tuan2", 2, "Math");
        addMon("Tuan2", 3, "Java");
        addMon("Tuan2", 3, "Physics");

        System.out.println("Mon Tuan1 ngay 2: " + getMons("Tuan1", 2));
        System.out.println("Mon Tuan1 ngay 4: " + getMons("Tuan1", 4));

        System.out.println("So buoi Java Tuan1: " + countMonInWeek("Tuan1", "Java"));

        printTimeTable();
    }

    public static void addMon(String week, int day, String subject) {

        schedule
                .computeIfAbsent(week, k -> new HashMap<>())
                .computeIfAbsent(day, k -> new ArrayList<>())
                .add(subject);
    }

    public static List<String> getMons(String week, int day) {
        return schedule
                .getOrDefault(week, Collections.emptyMap())
                .getOrDefault(day, Collections.emptyList());
    }

    public static int countMonInWeek(String week, String subject) {

        Map<Integer, List<String>> weekData =
                schedule.getOrDefault(week, Collections.emptyMap());

        int count = 0;

        for (List<String> subjects : weekData.values()) {
            for (String s : subjects) {
                if (s.equals(subject)) {
                    count++;
                }
            }
        }

        return count;
    }

    public static void printTimeTable() {

        for (Map.Entry<String, Map<Integer, List<String>>> weekEntry
                : schedule.entrySet()) {

            System.out.println(" Week: " + weekEntry.getKey());

            for (Map.Entry<Integer, List<String>> dayEntry
                    : weekEntry.getValue().entrySet()) {

                String subjects = String.join(", ", dayEntry.getValue());

                System.out.println(
                        "  Day " + dayEntry.getKey()
                                + ": [" + subjects + "]"
                );
            }
        }
    }
}