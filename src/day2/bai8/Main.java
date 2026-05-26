package day2.bai8;

public class Main {
    static void main() {
        for (int i = 2; i <= 9; i++) {
            System.out.printf("Bang cuu chuong %d %n", i);
            for (int j = 1; j <= 9; j++) {
                System.out.printf("%d * %d = %d %n", i, j, i * j);
            }
        }
    }
}
