package day7.bai11;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {
        List<Double> numbers = Arrays.asList(4.0, 9.0, 16.0);

        // lambda
        numbers.stream()
                .map(x -> Math.sqrt(x))
                .forEach(x -> System.out.println(x));

        // static method ref
        numbers.stream()
                .map(Math::sqrt)
                .forEach(System.out::println);


        // instance cua object cu the
        String myObj = "Hello";
        Supplier<String> lambda = () -> myObj.toString();
        Supplier<String> methodRef = myObj::toString;
        System.out.println(methodRef);

        // Instance cua type
        List<String> listChuVietThuong = Arrays.asList(
                "vietthuong",
                "dangduy"
        );

        listChuVietThuong.replaceAll(String::toUpperCase);
        listChuVietThuong.forEach(System.out::println);


        List<SinhVien> objs = listChuVietThuong.stream()
                .map(SinhVien::new)
                .toList();

        objs.forEach(System.out::println);

    }
}
