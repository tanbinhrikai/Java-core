package bai7;

import java.util.Random;

public class Main {

    public static void main(String[] args) {

        int rows = 3;
        int cols = 4;

        int[][] matrix = generateMatrix(rows, cols);

        printMatrix(matrix);

        printRowSums(matrix);
        printColSums(matrix);

        printDiagonalSum(matrix);

        findMax(matrix);
    }

    static int[][] generateMatrix(int rows, int cols) {

        int[][] matrix = new int[rows][cols];
        Random random = new Random();

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = random.nextInt(99) + 1;
            }
        }

        return matrix;
    }

    static void printMatrix(int[][] matrix) {

        System.out.println("Matrix:");

        for (int[] row : matrix) {
            for (int val : row) {
                System.out.printf("%3d ", val);
            }
            System.out.println();
        }
    }

    static void printRowSums(int[][] matrix) {

        System.out.println("\nRow sums:");

        for (int i = 0; i < matrix.length; i++) {
            int sum = 0;

            for (int j = 0; j < matrix[i].length; j++) {
                sum += matrix[i][j];
            }

            System.out.println("Row " + (i + 1) + ": " + sum);
        }
    }

    static void printColSums(int[][] matrix) {

        System.out.println("\nColumn sums:");

        int rows = matrix.length;
        int cols = matrix[0].length;

        for (int j = 0; j < cols; j++) {
            int sum = 0;

            for (int i = 0; i < rows; i++) {
                sum += matrix[i][j];
            }

            System.out.println("Col " + (j + 1) + ": " + sum);
        }
    }


    static void printDiagonalSum(int[][] matrix) {

        int rows = matrix.length;
        int cols = matrix[0].length;

        if (rows != cols) {
            System.out.println("\nNot a square matrix → no diagonal sum");
            return;
        }

        int sum = 0;

        for (int i = 0; i < rows; i++) {
            sum += matrix[i][i];
        }

        System.out.println("\nDiagonal sum: " + sum);
    }

    static void findMax(int[][] matrix) {

        int max = matrix[0][0];
        int row = 0;
        int col = 0;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {

                if (matrix[i][j] > max) {
                    max = matrix[i][j];
                    row = i;
                    col = j;
                }
            }
        }

        System.out.println("\nMax value: " + max);
        System.out.println("Position: [" + row + "," + col + "]");
    }
}