package bai8;

import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<SinhVien> svList = List.of(
                new SinhVien("An", "CNTT", 9.0),
                new SinhVien("Bao", "CNTT", 8.5),
                new SinhVien("Chi", "KinhTe", 7.0),
                new SinhVien("Dung", "CNTT", 8.0),
                new SinhVien("Lan", "KinhTe", 9.0)
        );




        String result = svList.stream()
                .map(SinhVien::getTen)
                .collect(Collectors.joining(", ", "[", "]"));


        Map<String, List<SinhVien>> group =
                svList.stream()
                        .collect(
                                Collectors.groupingBy(
                                        SinhVien::getKhoa
                                )
                        );

        System.out.println(group);

        Map<String, List<String>> onlyName =
                svList.stream()
                        .collect(
                                Collectors.groupingBy(
                                        SinhVien::getKhoa,
                                        Collectors.mapping(
                                                SinhVien::getTen,
                                                Collectors.toList()
                                        )
                                )
                        );


        System.out.println(onlyName);

        Map<Boolean, List<SinhVien>> partitioningBy =
                svList.stream()
                        .collect(
                                Collectors.partitioningBy(
                                        sv -> sv.getDiem() >= 8
                                )
                        );

        System.out.println(partitioningBy);


        Map<String, Long> counting =
                svList.stream()
                        .collect(
                                Collectors.groupingBy(
                                        SinhVien::getKhoa,
                                        Collectors.counting()
                                )
                        );

        System.out.println(counting);



        Map<String, Double> averagingDouble =
                svList.stream()
                        .collect(
                                Collectors.groupingBy(
                                        SinhVien::getKhoa,
                                        Collectors.averagingDouble(
                                                SinhVien::getDiem
                                        )
                                )
                        );

        System.out.println(averagingDouble);



        Map<String, Double> toMap =
                svList.stream()
                        .collect(
                                Collectors.toMap(
                                        SinhVien::getTen,
                                        SinhVien::getDiem
                                )
                        );


        System.out.println(toMap);



        DoubleSummaryStatistics stats =
                svList.stream()
                        .collect(
                                Collectors.summarizingDouble(
                                        SinhVien::getDiem
                                )
                        );

        System.out.println(stats);

    }
}
