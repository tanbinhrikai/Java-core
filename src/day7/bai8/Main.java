package day7.bai8;

import java.util.Arrays;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<SinhVien> danhSach = Arrays.asList(
                new SinhVien("An", "CNTT", 9.0),
                new SinhVien("Bao", "CNTT", 4.9),
                new SinhVien("Chi", "Kinh te", 7.0)
        );

        System.out.println("======Nối chuỗi==========");
        String danhSachTen = danhSach
                .stream()
                .map(SinhVien::getTen)
                .collect(Collectors.joining(", "));
        System.out.println(danhSachTen);

        System.out.println("==========Nhóm theo khoa==========");
        Map<String, List<SinhVien>> nhomTheoKhoa =
                danhSach
                        .stream()
                        .collect(
                                Collectors.groupingBy(SinhVien::getKhoa));
        nhomTheoKhoa.forEach(
                (key, values) -> System.out.println(
                        """
                                {
                                "%s": [%s]
                                },
                                """.formatted(key, values.stream().map(SinhVien::getTen).collect(Collectors.joining(", ")))
                ));

        System.out.println("==========Chia theo điều kiện==========");
        Map<Boolean, List<SinhVien>> chiaTheoDieuKien = danhSach
                .stream()
                .collect(Collectors.partitioningBy(sv -> sv.getDiem() >= 5));

        Consumer<List<SinhVien>> consumer1 = svs -> System.out.printf(
                """
                        Nhóm qua môn: [%s] %n
                        """, svs.stream().map(SinhVien::getTen).collect(Collectors.joining(", "))
        );
        Consumer<List<SinhVien>> consumer2 = svs -> System.out.printf(
                """
                        Nhóm rớt môn: [%s] %n
                        """, svs.stream().map(SinhVien::getTen).collect(Collectors.joining(", "))
        );
        consumer1.accept(chiaTheoDieuKien.get(true));
        consumer2.accept(chiaTheoDieuKien.get(false));

        System.out.println("==========ĐẾM SỐ NGƯƠI ĐẬU VÀ RỚT==========");
        Map<Boolean, Long> demNhom = danhSach
                .stream()
                .collect(
                        Collectors
                                .partitioningBy(sv ->
                                        sv.getDiem() >= 5,
                                        Collectors.counting()));

        System.out.println("So nguoi dau: " + demNhom.get(true));
        System.out.println("So nguoi rot: " + demNhom.get(false));

        System.out.println("==========ĐẾM NGƯỜI THEO KHOA==========");
        Map<String, Long> demNguoiTheoKhoa = danhSach
                .stream()
                .collect(
                        Collectors.groupingBy(SinhVien::getKhoa, Collectors.counting())
                );
        BiConsumer biConsumer = (key, value) -> System.out.println(
                """
                        "%s": %d
                        """.formatted(key, value)
        );
        demNguoiTheoKhoa.forEach(biConsumer);

        System.out.println("==========ĐIỂM TRUNG BÌNH THEO KHOA==========");
        Map<String, Double> diemTrungBinhTheoKhoa =
                danhSach
                        .stream()
                        .collect(Collectors.groupingBy(
                                SinhVien::getKhoa,
                                Collectors.averagingDouble(SinhVien::getDiem)
                        ));
        diemTrungBinhTheoKhoa.forEach(
                (key, value) -> System.out.println(key + " " + value)
        );

        System.out.println("==========IN RA TÊN VÀ ĐIỂM==========");
        Map<String, Double> mapTenDiem =
                danhSach.stream()
                        .collect(Collectors.toMap(SinhVien::getTen, SinhVien::getDiem));

        mapTenDiem.forEach((key, value) -> System.out.println(key + " " + value));

        System.out.println("========Thống kê toàn diên========");
        DoubleSummaryStatistics doubleSummaryStatistics = danhSach
                .stream()
                .collect(Collectors.summarizingDouble(SinhVien::getDiem));

        System.out.println(doubleSummaryStatistics);
    }
}
