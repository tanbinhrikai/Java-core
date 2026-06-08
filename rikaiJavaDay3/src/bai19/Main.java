package bai19;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        int[][] matrix = generateMatrix(n);

        System.out.println("Symmetric: " + isSymmetric(matrix));
        System.out.println("Identity: " + isIdentity(matrix));
        System.out.println("Diagonal: " + isDiagonal(matrix));

        scanner.close();
    }

    static int[][] generateMatrix(int n) {

        int[][] matrix = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = (int) (Math.random() * 12 + 1);
            }
        }

        return matrix;
    }

    static boolean isSymmetric(int[][] m) {

        int n = m.length;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (m[i][j] != m[j][i]) {
                    return false;
                }
            }
        }

        return true;
    }

    static boolean isIdentity(int[][] m) {

        int n = m.length;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {

                if (i == j && m[i][j] != 1) return false;
                if (i != j && m[i][j] != 0) return false;
            }
        }

        return true;
    }

    static boolean isDiagonal(int[][] m) {

        int n = m.length;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {

                if (i != j && m[i][j] != 0) {
                    return false;
                }
            }
        }

        return true;
    }
}