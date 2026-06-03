package bai5;

import java.util.function.Function;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        Predicate<SinhVien> gioi = sinhVien ->  sinhVien.gpa() > 8.5;
        Function<SinhVien,String> converToString = SinhVien::toString;

    }
}
