package day7.bai9;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<List<Integer>> nested = Arrays.asList(
                Arrays.asList(1,2,3),
                Arrays.asList(4,5,6),
                Arrays.asList(7,8,9)
        );
        List<Integer> flated =  nested.stream().flatMap(Collection::stream).toList();

        System.out.println(nested);
        System.out.println(flated);

        List<SinhVien> svList = Arrays.asList(
                new SinhVien("An", 9.0, Arrays.asList("Toan", "Ly")),
                new SinhVien("Bao", 7.0, Arrays.asList("Ly", "Hoa", "Sinh")),
                new SinhVien("Chi", 8.0, Arrays.asList("Toan", "Anh"))
        );

        Set<String> cacMonHocs = svList
                .stream()
                .map(SinhVien::getMonHoc)
                .flatMap(Collection::stream)
                .collect(Collectors.toSet());

        System.out.println(cacMonHocs);

        List<SinhVien> svList2 = Arrays.asList(
                new SinhVien("An", 9.0, Arrays.asList("Toan")),
                new SinhVien("Bao", 7.0, Arrays.asList("Ly"))
        );

        Optional<SinhVien> optSv = svList.stream()
                .filter(sv -> sv.getDiem() >= 10.0)
                .findFirst();
        System.out.println(optSv);

        SinhVien test1 = optSv.orElse(null);
        SinhVien test2 = optSv.orElseGet(() -> null);
        SinhVien test3 = optSv.orElseThrow(() -> new RuntimeException("loi"));

        Optional<String> ten = optSv.map(SinhVien::getTen);

    }
}
