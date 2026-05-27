package day2.bai20;

import java.util.Scanner;

public class Main {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số hàng n: ");
        int n = scanner.nextInt();

        int[][] triangle = new int[n][n];
        for(int i = 0; i < n; i++) {
            triangle[i][0] = 1;
            triangle[i][i] = 1;

            for(int k = 1; k < i; k++) { // mỗi hàng sẽ có i phần tu mà đầu và cuối đã là fix cung gia tri
                                            // chỉ cần tính khúc giữa
                triangle[i][k] = triangle[i - 1][k - 1] + triangle[i - 1][k];
            }
        }

        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n - i - 1; j++) {
                System.out.print("\t");
            }

            for(int k = 0; k <= i; k++) {
                System.out.printf("%d\t\t", triangle[i][k]);
            }
            System.out.println("");
        }

    }
}
