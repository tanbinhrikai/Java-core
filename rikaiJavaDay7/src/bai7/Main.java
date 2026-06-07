package bai7;

import java.util.Comparator;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        List<SinhVien> svList = List.of(
                new SinhVien("An", 9.0),
                new SinhVien("Bao", 8.5),
                new SinhVien("Chi", 9.5),
                new SinhVien("Dung", 7.0),
                new SinhVien("Huy", 8.5)
        );

        double tong = svList.stream()
                .map(SinhVien::getDiem)
                .reduce(0.0, Double::sum);

        System.out.println(tong);

        int tich = List.of(2,3,4)
                .stream()
                .reduce(1, (a,b) -> a * b);

        System.out.println(tich);


        String ten = svList.stream()
                .map(SinhVien::getTen)
                .reduce("", (a,b) -> a + " " + b);

        System.out.println(ten);


        DoubleSummaryStatistics stats =
                svList.stream()
                        .mapToDouble(SinhVien::getDiem)
                        .summaryStatistics();

        System.out.println(stats);

        boolean anyMatch = svList.stream()
                .anyMatch(sv -> sv.getDiem() >= 9);

        System.out.println(anyMatch);


        boolean allMatch = svList.stream()
                .allMatch(sv -> sv.getDiem() > 0);

        System.out.println(allMatch);


        boolean noneMatch = svList.stream()
                .noneMatch(sv -> sv.getDiem() < 0);

        System.out.println(noneMatch);

        Optional<SinhVien> sv_first =
                svList.stream()
                        .findFirst();

        System.out.println(sv_first.get());


        Optional<SinhVien> sv_any =
                svList.stream()
                        .findAny();


        long soLuong = svList.stream()
                .count();

        System.out.println(soLuong);


        Optional<SinhVien> min =
                svList.stream()
                        .min(
                                Comparator.comparingDouble(
                                        SinhVien::getDiem
                                )
                        );

        System.out.println(min.get());



        Optional<SinhVien> max =
                svList.stream()
                        .max(
                                Comparator.comparingDouble(
                                        SinhVien::getDiem
                                )
                        );

        System.out.println(max.get());



        List<Integer> nums =
                List.of(1,2,2,3,3,3,4);

        nums.stream()
                .distinct()
                .forEach(System.out::println);


        svList.stream()
                .limit(3)
                .forEach(System.out::println);


        svList.stream()
                .skip(2)
                .forEach(System.out::println);





    }
}
