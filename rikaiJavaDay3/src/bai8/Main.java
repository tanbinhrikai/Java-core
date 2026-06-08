package bai8;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Nhập hàng và cột ma trận A:");
        int rowsA = scanner.nextInt();
        int colsA = scanner.nextInt();

        int[][] A = generateMatrix(rowsA, colsA, random);

        System.out.println("Nhập hàng và cột ma trận B:");
        int rowsB = scanner.nextInt();
        int colsB = scanner.nextInt();

        int[][] B = generateMatrix(rowsB, colsB, random);

        System.out.println("\nMatrix A:");
        printMatrix(A);

        System.out.println("\nMatrix B:");
        printMatrix(B);

        if (colsA != rowsB) {
            System.out.println("\nKhông thể nhân 2 ma trận!");
            return;
        }


        int[][] C = multiply(A, B);

        System.out.println("\nResult matrix C = A x B:");
        printMatrix(C);

        scanner.close();
    }

    static int[][] generateMatrix(int rows, int cols, Random random) {

        int[][] matrix = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = random.nextInt(12) + 1;
            }
        }

        return matrix;
    }

    static void printMatrix(int[][] matrix) {

        for (int[] row : matrix) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }

    static int[][] multiply(int[][] A, int[][] B) {

        int rowsA = A.length;
        int colsA = A[0].length;
        int colsB = B[0].length;

        int[][] C = new int[rowsA][colsB];

        for (int i = 0; i < rowsA; i++) {
            for (int j = 0; j < colsB; j++) {

                int sum = 0;

                for (int k = 0; k < colsA; k++) {
                    sum += A[i][k] * B[k][j];
                }

                C[i][j] = sum;
            }
        }

        return C;
    }
}