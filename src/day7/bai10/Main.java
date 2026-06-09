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

//        DoubleSummaryStatistics

    }
}
