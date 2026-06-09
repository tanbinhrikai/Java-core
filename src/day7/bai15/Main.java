package day7.bai15;

import day7.bai8.SinhVien;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public record Range(SinhVien max, SinhVien min) {
    }

    public static void main(String[] args) {
        List<SinhVien> danhSach = Arrays.asList(
                new SinhVien("An", "CNTT", 9.0),
                new SinhVien("Bao", "CNTT", 4.9),
                new SinhVien("Chi", "Kinh te", 7.0)
        );


        var result = danhSach.stream()
                .collect(Collectors.teeing(
                        Collectors.summingDouble(SinhVien::getDiem),
                        Collectors.counting(),
                        (sum, count) -> sum / count
                ));

        System.out.println(result);

        var result2 = danhSach.stream()
                .collect(Collectors.teeing(
                        Collectors.maxBy(Comparator.comparingDouble(SinhVien::getDiem)),
                        Collectors.minBy(Comparator.comparingDouble(SinhVien::getDiem)),
                        (max, min) -> new Range(max.orElse(null), min.orElse(null))
                ));
        System.out.println(result2.max().getDiem() + " " + result2.min().getDiem());


        var result3 = danhSach.stream()
                .collect(Collectors.teeing(
                        Collectors.partitioningBy(sv -> sv.getDiem() >= 5),
                        Collectors.counting(),
                        (partitionMap, totalCount) -> String.format(
                                """
                                        Dau: %d
                                        Rot: %d
                                        """, partitionMap.get(true).size(), partitionMap.get(false).size()
                        )
                ));
        System.out.println(result3);
    }
}
