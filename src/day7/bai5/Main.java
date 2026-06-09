package day7.bai5;

import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.function.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<SinhVien> svList = Arrays.asList(
                new SinhVien("Chi", 7.5, 20),
                new SinhVien("An", 9.5, 21),
                new SinhVien("Bao", 5.1, 23)
        );

        // Predicate: Điều kiện
        Predicate<SinhVien> diemKha = sv -> sv.getScore() >= 6.5;
        Predicate<SinhVien> tuoiTre = sv -> sv.getAge() < 22;
        Predicate<SinhVien> kha_va_tre = diemKha.and(tuoiTre);

        List<SinhVien> filtered = svList.stream()
                .filter(kha_va_tre).toList();
//                .map(tenInHoa).collect(Collectors.toList());

        System.out.println(svList.stream().filter(kha_va_tre).count());

        for(SinhVien sv : filtered) {
            System.out.println(sv);
        }

        // Chuyen doi sinh vien
        Function<SinhVien, String> layTen = SinhVien::getName;
        Function<String, String> inHoa = String::toUpperCase;
        Function<SinhVien, String> tenInHoa = layTen.andThen(inHoa);

        List<String> nameSinhVienConvert = svList.stream()
                .map(tenInHoa).toList();

        for(String s : nameSinhVienConvert) {
            System.out.println(s);
        }

        // consumer in thong tin
        Consumer<SinhVien> consumer = sv -> System.out.println(sv);
        svList.forEach(consumer);

        Supplier<SinhVien> supplier = () -> new SinhVien("Unknown", 0.0, 18);

        System.out.println("Tinh diem tong hop");
        // Tinh diem tong hop
        Function<Double, String> xepLoai = score -> score >= 8.0 ? "Gioi" : "Kha";
        BiFunction<Double, Integer, Double> tinhDiemUuTien = (diem, tuoi) ->
                tuoi < 22 ? diem + 0.5 : diem;
        BiFunction<Double, Integer, String> ketQuaCuoiCung = tinhDiemUuTien.andThen(xepLoai);

        SinhVien svTest = svList.getFirst();

        String xepLoai2 = ketQuaCuoiCung.apply(svTest.getScore(), svTest.getAge());
        System.out.println(svTest);
        System.out.println(xepLoai2);

    }
}
