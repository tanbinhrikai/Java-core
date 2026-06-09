package day7.bai7;

import java.util.*;
import java.util.function.Consumer;

public class Main {
    public static void main(String[] args) {
        List<SinhVien> svList = Arrays.asList(
                new SinhVien("Nguyen Van A", 7.0, 20),
                new SinhVien("Le Thi B", 8.5, 21),
                new SinhVien("Tran Van C", 5.0, 23),
                new SinhVien("Pham Thi D", 9.5, 20),
                new SinhVien("Nguyen VAN A", 7.0, 20) // Trùng lặp
        );
        System.out.println("=== 1. REDUCE() ===");
        double tongDiem =  svList.stream()
                .map(SinhVien::getDiem)
                .reduce(0.0, Double::sum);

        System.out.println(tongDiem);

        double tichTuoi = svList.stream().map(SinhVien::getTuoi)
                .reduce(1, (a, b) -> a * b);

        String names  = svList.stream().map(SinhVien::getTen)
                .reduce("", (a, b) -> a.isEmpty() ? b : a + ", " + b);
        System.out.println(names);

        DoubleSummaryStatistics summaryStatistics = svList.stream().mapToDouble(SinhVien::getDiem).summaryStatistics();
        System.out.printf(
                """
                        count=%d
                        sum=%.2f
                        min=%.2f
                        average=%.2f
                        max=%.2f
                        %n""", summaryStatistics.getCount(),
        summaryStatistics.getSum(),
        summaryStatistics.getMin(),
        summaryStatistics.getAverage(),
        summaryStatistics.getMax());

        System.out.println( svList.stream().anyMatch(sv -> sv.getDiem() >= 10));;
        System.out.println(svList.stream().allMatch(sv -> sv.getDiem() > 0));
        System.out.println(svList.stream().noneMatch(sv -> sv.getDiem() == 10));
        System.out.println(svList.stream().noneMatch(sv -> sv.getDiem() < 0));


        Optional<SinhVien> optionalSinhVien = svList.stream().findFirst();
        Optional<SinhVien> optionalSinhVien1 = svList.stream().findAny();
        System.out.println(optionalSinhVien1.get());

        System.out.println(svList.stream().count());;
        System.out.println(svList.stream().max(Comparator.comparingDouble(SinhVien::getDiem)));
        System.out.println(svList.stream().min(Comparator.comparingDouble(SinhVien::getDiem)));

        Consumer<SinhVien> consumer = System.out::println;

        System.out.println("=========");
        System.out.println("Original list");
        svList.forEach(consumer);

        System.out.println("Distinct");
        svList.stream()
                .distinct()
                .skip(2)
                .limit(3)
                .forEach(consumer);

    }
}
