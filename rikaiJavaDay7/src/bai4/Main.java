package bai4;

public class Main {
    public static void main(String[] args) {


    }
    public static Result<SinhVien> parseSinhVien(String line) {
        try {
            String[] parts = line.split(",");

            if (parts.length != 2) {
                return new Failure<>("Sai dinh dang input");
            }

            String name = parts[0];
            double gpa;

            try {
                gpa = Double.parseDouble(parts[1]);
            } catch (NumberFormatException e) {
                return new Failure<>("Loi dinh dang diem");
            }

            SinhVien sv = new SinhVien(name, gpa);
            return new Success<>(sv);

        } catch (Exception e) {
            return new Failure<>("Loi khong xac dinh");
        }
    }
}
