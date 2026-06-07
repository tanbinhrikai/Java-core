package bai9;

import java.util.List;
import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        List<SinhVien> svList = List.of(
                new SinhVien("An", 9.0,
                        List.of("Java", "SQL")),

                new SinhVien("Bao", 8.5,
                        List.of("Java", "Spring")),

                new SinhVien("Chi", 7.0,
                        List.of("Docker", "SQL"))
        );

        List<String> monHoc = svList.stream()
                .flatMap(sv -> sv.getMonHoc().stream())
                .distinct()
                .toList();

        System.out.println(monHoc);


        Optional<SinhVien> opt = svList.stream()
                .filter(sv -> sv.getDiem() >= 8)
                .findFirst();

        String ten = opt
                .map(SinhVien::getTen)
                .orElse("Khong tim thay");

        System.out.println(ten);


        SinhVien sv1 = svList.stream()
                .filter(sv -> sv.getTen().equals("Tung"))
                .findFirst()
                .orElse(
                        new SinhVien(
                                "Mac dinh",
                                0,
                                List.of()
                        )
                );

        System.out.println(sv1);

        try {
            SinhVien sv2 = svList.stream()
                    .filter(sv -> sv.getTen().equals("Tung"))
                    .findFirst()
                    .orElseThrow(
                            () -> new RuntimeException("Khong tim thay")
                    );

            System.out.println(sv2);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }




    }
}
