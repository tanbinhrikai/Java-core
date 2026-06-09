package day7.bai20;

public record KetQuaSinhVien(String msv, String hoTen, String khoa, double diemTrungBinh) {
    public String toCSVRow() {
        return String.format("%s,%s,%s,%.2f", msv, hoTen, khoa, diemTrungBinh);
    }

}
