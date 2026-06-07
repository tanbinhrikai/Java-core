package bai11;

import java.util.List;
import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {
        List<Double> numbers = List.of(4.0, 9.0, 16.0);

        System.out.println("Static Method Reference:");

        numbers.stream()
                .map(Math::sqrt)
                .forEach(System.out::println);

        String text = "java";

        Supplier<String> supplier = text::toUpperCase;

        System.out.println("\n Instance của object cụ thể:");
        System.out.println(supplier.get());

        List<String> names = List.of(
                "an",
                "bao",
                "chi"
        );

        System.out.println("\nInstance của type:");

        names.stream()
                .map(String::toUpperCase)
                .forEach(System.out::println);


        System.out.println("\nConstructor Reference:");

        List<SinhVien> dsSinhVien =
                names.stream()
                        .map(SinhVien::new)
                        .toList();

        dsSinhVien.forEach(System.out::println);


    }
}
