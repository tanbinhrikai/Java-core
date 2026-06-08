package bai12;

public class Matrix {

    private final int[][] data;
    private final int rows;
    private final int cols;

    public Matrix(int[][] data, int rows, int cols) {
        this.data = data;
        this.rows = rows;
        this.cols = cols;
    }

    public Matrix add(Matrix other) {
        if (rows != other.rows || cols != other.cols) {
            System.out.println("Cannot add matrices with different dimensions");
            return null;
        }

        int[][] result = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = this.data[i][j] + other.data[i][j];
            }
        }

        return new Matrix(result, rows, cols);
    }

    public Matrix multiply(Matrix other) {
        if (this.cols != other.rows) {
            System.out.println("Cannot multiply matrices (invalid dimensions)");
            return null;
        }

        int[][] result = new int[this.rows][other.cols];

        for (int i = 0; i < this.rows; i++) {
            for (int j = 0; j < other.cols; j++) {
                for (int k = 0; k < this.cols; k++) {
                    result[i][j] += this.data[i][k] * other.data[k][j];
                }
            }
        }

        return new Matrix(result, this.rows, other.cols);
    }

    public Matrix transpose() {
        int[][] result = new int[cols][rows];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[j][i] = data[i][j];
            }
        }

        return new Matrix(result, cols, rows);
    }
}