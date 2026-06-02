package day3.bai19;

public class Main {
    static boolean isSymmetric(int[][] matrix) {
        int row = matrix.length;
        int col = matrix[0].length;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (matrix[i][j] != matrix[j][i]) {
                    return false;
                }
            }
        }
        return true;
    }

    static boolean isIdentity(int[][] matrix) {
        if(isDiagonal(matrix)) {
            return false;
        }
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (i == j && matrix[i][j] != 1) {
                    return false;
                }
            }
        }

        return true;
    }

    static boolean isDiagonal(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (i != j && matrix[i][j] != 0) {
                    return false;
                }
            }
        }

        return true;
    }

    static void transpose(int[][] matrix) {
        int[][] newMatrix = new int[matrix[0].length][matrix.length];

        for(int i =0; i < matrix.length; i++) {
            for(int j = 0; j < matrix[0].length; j++) {
                newMatrix[j][i] = matrix[i][j];
            }
        }
        printMatrix(newMatrix);

    }

    static int trace(int[][] matrix) {
        int row = matrix.length;
        int col = matrix[0].length;
        int sum = 0;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (i == j) sum += matrix[i][j];
            }
        }
        return sum;

    }

    static void printMatrix(int[][] matrix) {
        int row = matrix.length;
        int col = matrix[0].length;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.printf("%d\t", matrix[i][j]);
            }
            System.out.println("");
        }
    }

    static void main() {
//        int[][] matrix = {{1, 2, 3}, {2, 5, 4}, {3, 4, 6}};
//        int[][] matrix = {{1, 0, 0}, {0, 1, 0}, {0, 0, 1}};
        int[][] matrix = {{1,2,3}, {4,5,6}};

        printMatrix(matrix);
        System.out.printf("Tong duong cheo chinh: %d %n", trace(matrix));
        System.out.printf("La ma tran doi xung: %b %n", isSymmetric(matrix));
        System.out.printf("La ma tran duong cheo: %b %n", isDiagonal(matrix));
        System.out.printf("La ma tran don vi: %b %n", isIdentity(matrix));
        transpose(matrix);
    }
}
