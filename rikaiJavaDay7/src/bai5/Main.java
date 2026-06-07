package bai5;

import java.util.ArrayList;
import java.util.List;
import java.util.function.*;

public class Main {
    public static void main(String[] args) {
        List<SinhVien> list = new ArrayList<>();

        Predicate<SinhVien> gioi = sinhVien ->  sinhVien.gpa() > 8.5;
        Predicate<SinhVien> kha = sv -> sv.gpa() >= 6.5;
        Predicate<SinhVien> tre = sv -> sv.age() < 22;

        Predicate<SinhVien> khaVaTre = kha.and(tre);
        long count = list.stream()
                .filter(khaVaTre)
                .count();


        Function<SinhVien, String> convertToString =
                sv -> sv.name() + " - " + sv.gpa();

        list.stream()
                .map(convertToString)
                .forEach(System.out::println);


        Consumer<SinhVien> inThongTin =
                sv -> System.out.println(sv.name());

        Supplier<SinhVien> taoMacDinh =
                () -> new SinhVien("An", 8.0, 20);

        SinhVien sv = taoMacDinh.get();


        BiFunction<Double, Double, Double> tinhDiem =
                (giuaky, cuoiky) -> giuaky * 0.4 + cuoiky * 0.6;

    }
}
