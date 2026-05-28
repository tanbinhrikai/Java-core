package day4.bai6;

public class Main {
    static void main() {
        NhietKe nhietKe = new NhietKe();
        nhietKe.setNhietDo(36.5);
        nhietKe.setNhietDo(39.0);
        nhietKe.setNhietDo(37.5);
        System.out.printf("NhietKe.getSoLanCanhBao() = %d %n", NhietKe.getSoLanCanhBao());

        System.out.printf("ChuyenFahrenheit: %.2f°F", nhietKe.chuyenDoiDonVi().getNhietDo());
    }
}
