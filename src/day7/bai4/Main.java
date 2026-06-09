package day7.bai4;

public class Main {
    public static Result<SinhVien> parseSinhVien(String line) {
        String[] parts = line.split(",");
        String name = parts[0].trim();
        try {
            double score = Double.parseDouble(parts[1].trim());
            return new Success<>(new SinhVien(name, score));
        } catch (NumberFormatException e) {
            return new Failure<>("[" + line + "] Loi dinh dang diem");
        }
    }

    public static void main(String[] args) {
        String[] testLines = {
                "An,9.0",
                "Bao,abc",
                "Cuong,8.5",
                "Minh,Lỗi định dạng sai dấu phẩy"
        };

        for (String line : testLines) {
            Result<SinhVien> result = parseSinhVien(line);

            // khong can default vi switch expression exhaustive
            switch (result) {
                case Success<SinhVien> s -> process(s.value());
                case Failure<SinhVien> f -> log(f.error());
            }
        }
    }

    private static void process(SinhVien sv) {
        System.out.printf("Success[SinhVien(%s, %.2f)]%n", sv.name(), sv.age());
    }

    private static void log(String errorMessage) {
        System.err.println(errorMessage);
    }
}
