package day2.bai20;

import java.util.Scanner;

public class Main {
    static void main() {
        Scanner scanner = new Scanner(scanner.System.in);
        System.out.print("Nhập số hàng n: ");
        int n = scanner.nextInt();

        // Bước 1: Khởi tạo và tính toán mảng 2 chiều
        int[][] triangle = new int[n][n];

        for (int i = 0; i < n; i++) {
            // Phần tử đầu tiên và cuối cùng của hàng luôn là 1
            triangle[i][0] = 1;
            triangle[i][i] = 1;

            // Tính các phần tử ở giữa dựa vào hàng trước đó
            for (int k = 1; k < i; k++) {
                triangle[i][k] = triangle[i - 1][k - 1] + triangle[i - 1][k];
            }
        }

        // Bước 2: In tam giác Pascal canh giữa
        for (int i = 0; i < n; i++) {
            // In khoảng trắng ở đầu mỗi hàng để tạo hiệu ứng canh giữa
            // Càng xuống dưới, số khoảng trắng càng ít đi
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print("  "); // Bạn có thể chỉnh 2 khoảng trắng thành 1 tùy độ rộng mong muốn
            }

            // In các giá trị của hàng i
            for (int k = 0; k <= i; k++) {
                // In số kèm theo khoảng trắng phía sau để các số không dính vào nhau
                System.out.print(triangle[i][k] + "   ");
            }

            // Xuống dòng sau khi in xong một hàng
            System.out.println();
        }

    }
}
