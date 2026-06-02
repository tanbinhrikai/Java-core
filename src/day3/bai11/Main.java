package day3.bai11;

public class Main {
    static void thapHaNoi(int n, char cot_bat_dau, char cot_trung_gian, char cot_dich) {

        if(n == 1) {
            System.out.println("Chuyển đĩa 1 từ cọc " + cot_bat_dau + " sang cọc " + cot_dich);
            return;
        }

        thapHaNoi(n - 1, cot_bat_dau, cot_dich, cot_trung_gian);

        System.out.println("Chuyển đĩa " + n + " từ cọc " + cot_bat_dau + " sang cọc " + cot_dich);

        thapHaNoi(n - 1, cot_dich, cot_bat_dau, cot_trung_gian);

    }

    static void main() {
        thapHaNoi(3, 'A', 'B', 'C');
    }
}
