package day7.bai6;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<SinhVien> svList = Arrays.asList(
                new SinhVien("Chi", 8.1),
                new SinhVien("An", 9.5),
                new SinhVien("Bao", 8.5)
        );

        List<String> filtered = svList.stream()
                .filter(sv -> sv.getScore() >= 8.0)
                .sorted(Comparator.comparingDouble(SinhVien::getScore).reversed())
                .limit(3)
                .map(SinhVien::getName)
                .toList()
                ;

        Set<String> sets = svList.stream()
                .filter(sv -> sv.getScore() >= 8.0)
                .sorted(Comparator.comparingDouble(SinhVien::getScore).reversed())
                .limit(3)
                .map(SinhVien::getName)
                .collect(Collectors.toSet())
                ;

        Map<String, Double> maps =  svList.stream()
                .filter(sv -> sv.getScore() >= 8.0)
                .sorted(Comparator.comparingDouble(SinhVien::getScore).reversed())
                .limit(3)
                 .collect(Collectors.toMap(
                         SinhVien::getName,
                         SinhVien::getScore
                 ))
        ;

       maps.forEach((key, value) -> System.out.println(key + " " + value));
    }


}
