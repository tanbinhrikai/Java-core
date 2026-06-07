package bai6;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

            List<SinhVien> svList = List.of(
                    new SinhVien("An", 9.0),
                    new SinhVien("Bao", 8.5),
                    new SinhVien("Chi", 9.5),
                    new SinhVien("Dung", 7.0),
                    new SinhVien("Huy", 8.0)
            );
        List<SinhVien> ketQua = svList.stream()
                .filter(sv -> sv.getDiem() >= 8.0)
                .collect(Collectors.toList());

        System.out.println(ketQua);



        List<String> tenSinhVien = svList.stream()
                .map(SinhVien::getTen)
                .collect(Collectors.toList());

        System.out.println(tenSinhVien);
        List<SinhVien> sapXep = svList.stream()
                .sorted(
                        Comparator.comparingDouble(SinhVien::getDiem)
                                .reversed()
                )
                .collect(Collectors.toList());

        System.out.println(sapXep);


        List<SinhVien> top3 = svList.stream()
                .limit(3)
                .collect(Collectors.toList());


        Set<String> dsTen = svList.stream()
                .map(SinhVien::getTen)
                .collect(Collectors.toSet());


        Map<String, Double> map = svList.stream()
                .collect(Collectors.toMap(
                        SinhVien::getTen,
                        SinhVien::getDiem
                ));

        System.out.println(map);
    }
}
