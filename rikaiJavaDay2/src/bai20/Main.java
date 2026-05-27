package bai20;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập n: ");
        int n = scanner.nextInt();

        int[][] mang = new int[n][n];

        for (int hang = 0; hang < n; hang++) {

            for (int cot = 0; cot <= hang; cot++) {

                if (cot == 0 || cot == hang) {
                    mang[hang][cot] = 1;
                }

                else {
                    mang[hang][cot] =
                            mang[hang - 1][cot - 1]
                                    + mang[hang - 1][cot];
                }
            }
        }

        for (int hang = 0; hang < n; hang++) {

            for (int space = 0; space < n - hang; space++) {
                System.out.print("  ");
            }

            for (int cot = 0; cot <= hang; cot++) {
                System.out.print(mang[hang][cot] + "   ");
            }

            System.out.println();
        }
    }
}