package day7.bai20;

import java.util.Optional;

public record SinhVien(String msv, String hoTen, String khoa, double diemToan, double diemLy, double diemHoa) {

    public double tinhDiemTrungBinh() {
        return (diemToan + diemLy + diemHoa) / 3.0;
    }

    public static Optional<SinhVien> fromCSV(String line) {
        try {
            String[] parts = line.split(",");
            if (parts.length < 6) return Optional.empty();
            String maSV = parts[0].trim();
            String hoTen = parts[1].trim();
            String khoa = parts[2].trim();
            double toan = Double.parseDouble(parts[3].trim());
            double ly = Double.parseDouble(parts[4].trim());
            double hoa = Double.parseDouble(parts[5].trim());
            return Optional.of(new SinhVien(maSV, hoTen, khoa, toan, ly, hoa));
        } catch (Exception e) {
            return Optional.empty();
        }
    }
}
