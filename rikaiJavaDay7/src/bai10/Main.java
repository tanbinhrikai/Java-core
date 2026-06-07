package bai10;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<SinhVien> ds = List.of(
                new SinhVien("An", "CNTT", 9.0),
                new SinhVien("Bao", "CNTT", 8.2),
                new SinhVien("Chi", "CNTT", 9.5),
                new SinhVien("Dung", "CNTT", 4.0),

                new SinhVien("Lan", "KinhTe", 8.8),
                new SinhVien("Mai", "KinhTe", 7.5),
                new SinhVien("Nam", "KinhTe", 3.5),

                new SinhVien("Tuan", "XayDung", 6.8),
                new SinhVien("Hoa", "XayDung", 9.2)
        );


        ds.stream()
                .sorted(
                        Comparator.comparingDouble(SinhVien::getDiem)
                                .reversed()
                )
                .limit(3)
                .forEach(System.out::println);




        Map<String, List<SinhVien>> top3TheoKhoa =
                ds.stream()
                        .collect(Collectors.groupingBy(
                                SinhVien::getKhoa,
                                Collectors.collectingAndThen(
                                        Collectors.toList(),
                                        list -> list.stream()
                                                .sorted(
                                                        Comparator.comparingDouble(
                                                                        SinhVien::getDiem)
                                                                .reversed()
                                                )
                                                .limit(3)
                                                .toList()
                                )
                        ));



        Map<String, Long> thongKe =
                ds.stream()
                        .collect(Collectors.groupingBy(
                                sv -> xepLoai(sv.getDiem()),
                                Collectors.counting()
                        ));


        long tong = ds.size();

        thongKe.forEach((loai, soLuong) -> {
            double phanTram =
                    soLuong * 100.0 / tong;

            System.out.printf(
                    "%s: %d sv (%.1f%%)%n",
                    loai,
                    soLuong,
                    phanTram
            );
        });



        Map<String, Optional<SinhVien>> maxTheoKhoa =
                ds.stream()
                        .collect(Collectors.groupingBy(
                                SinhVien::getKhoa,
                                Collectors.maxBy(
                                        Comparator.comparingDouble(
                                                SinhVien::getDiem
                                        )
                                )
                        ));


        Map<String, Optional<SinhVien>> minTheoKhoa =
                ds.stream()
                        .collect(Collectors.groupingBy(
                                SinhVien::getKhoa,
                                Collectors.minBy(
                                        Comparator.comparingDouble(
                                                SinhVien::getDiem
                                        )
                                )
                        ));


        List<SinhVien> thiLai =
                ds.stream()
                        .filter(sv -> sv.getDiem() < 5)
                        .toList();

        thiLai.forEach(System.out::println);


        double avg =
                ds.stream()
                        .collect(
                                Collectors.averagingDouble(
                                        SinhVien::getDiem
                                )
                        );

        System.out.println(avg);

    }

    static String xepLoai(double diem) {
        if (diem >= 9) return "Xuat sac";
        if (diem >= 8) return "Gioi";
        if (diem >= 6.5) return "Kha";
        if (diem >= 5) return "Trung binh";
        return "Yeu";
    }
}
