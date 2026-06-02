package day3.bai19;

public class Main {
    static boolean isSymmetric(int[][] matrix) {
        int row = matrix.length;
        int col = matrix[0].length;
        for(int i = 0; i < row; i++) {
            for(int j = 0; j < col; j++) {
                if(matrix[i][j] != matrix[j][i]) {
                    return false;
                }
            }
        }
        return true;
    }

    static boolean isIdentity() {
        return false;
    }

    static boolean isDiagonal() {
        return false;
    }

    static void transpose() {

    }

    static int trace(int[][] matrix) {
        int row = matrix.length;
        int col = matrix[0].length;
        int sum = 0;
        for(int i = 0; i < row; i++) {
            for(int j = 0; j < col; j++) {
                if(i == j) sum += matrix[i][j];
            }
        }
        return sum;

    }

    static void printMatrix(int[][] matrix) {
        int row = matrix.length;
        int col = matrix[0].length;
        for(int i = 0; i < row; i++) {
            for(int j = 0; j < col; j++) {
                System.out.printf("%d\t", matrix[i][j]);
            }
            System.out.println("");
        }
    }
    static void main() {
        int[][] matrix = {{1,2,3}, {2,5,4}, {3,4,6}};
        printMatrix(matrix);
        System.out.printf("Tong duong cheo chinh: %d %n", trace(matrix));
        System.out.printf("La ma tran doi xung: %b %n", isSymmetric(matrix));
    }
}
