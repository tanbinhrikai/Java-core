package day7.bai10;

import java.util.*;
import java.util.function.BiConsumer;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<SinhVien> svList = Arrays.asList(
                new SinhVien("Giang", "Ngoai ngu", 7.5),
                new SinhVien("Chi", "CNTT", 9.5),
                new SinhVien("Bao", "Kinh te", 8.8),
                new SinhVien("Dung", "Kinh te", 9.2),
                new SinhVien("An", "CNTT", 9.0),
                new SinhVien("Huong", "Ngoai ngu", 4.0),
                new SinhVien("Duy", "Ngoai ngu", 7.5),
                new SinhVien("Binh", "CNTT", 4.5)
        );

        Function<List<SinhVien>, List<SinhVien>> locTop3 = danhSach -> danhSach
                .stream()
                .sorted(Comparator.comparingDouble(SinhVien::score))
                .limit(3)
                .toList().reversed();
        // Nhom theo khoa => lay cai list da nhom tiep tuc sap xep roi lay ra top 3 nguoi diem cao nhat moi khoa
        Map<String, List<SinhVien>> layTop3MoiKhoa = svList
                .stream()
                .collect(Collectors.groupingBy(
                        SinhVien::khoa,
                        Collectors.collectingAndThen(
                                Collectors.toList(),
                                listIn -> listIn.stream().sorted(Comparator.comparingDouble(SinhVien::score).reversed()).limit(3).toList())
                ));

        BiConsumer<String, List<SinhVien>> biConsumer = (key, value) -> System.out.println("""
                "%s": [%n%s]
                """.formatted(key,
                value.stream()
                        .map(sv -> String.format("ten=%s, score=%.2f %n", sv.ten(), sv.score()))
                        .collect(Collectors.joining())
                ));
        System.out.println(layTop3MoiKhoa);
        layTop3MoiKhoa.forEach(biConsumer);

        // thong ke theo xep loai
        Map<XepLoai, Long> thongKeXepLoai = svList.stream()
                .collect(
                        Collectors.groupingBy(SinhVien::getXepLoai, Collectors.counting())
                );
        thongKeXepLoai.forEach((key, value) -> System.out.println(key + " " + value));

        // sinh vien diem cao nhat
        Map<String, Optional<SinhVien>> maxSVs =  svList.stream()
                .collect(Collectors.groupingBy(
                        SinhVien::khoa,
                        Collectors.maxBy(Comparator.comparingDouble(SinhVien::score))
                ));
        System.out.println("Diem cao nhat moi khoa");
        maxSVs.forEach((key, value) -> System.out.println(key + " " + value.orElse(null).ten() + " " + value.get().score()));

        // sinh vien diem thap nhat
        Map<String, Optional<SinhVien>> minSVs =
                svList.stream()
                        .collect(Collectors.groupingBy(
                                SinhVien::khoa,
                                Collectors.minBy(Comparator.comparingDouble(SinhVien::score))
                        ));
        System.out.println("Diem thap nhat moi khoa");
        minSVs.forEach((key, value) -> System.out.println(key + " " + value.orElse(null).ten() + " " + value.get().score()));

        Map<String, Map<Boolean, List<SinhVien>>> listPartition = svList.stream()
                .collect(
                        Collectors.groupingBy(SinhVien::khoa,
                                Collectors.partitioningBy(sv -> sv.score() >= 5)));
        System.out.println("Danh sach sinh vien < 5 can thi lai");
        listPartition.forEach((key, value) -> {
            System.out.printf("""
                    %s: %s
                    """.formatted(key, value.get(false).stream()
                    .map(SinhVien::toString)
                    .collect(Collectors.joining())
            ));
        });

        System.out.println("Diem trung binh toan truong");
        System.out.println(svList.stream()
                .mapToDouble(SinhVien::score)
                .average().getAsDouble());;
    }
}
