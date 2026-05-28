package day4.bai12;

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
        return null;
    }

    public Matrix multiply(Matrix other) {
        return null;
    }

    public void transpose() {

    }

    public void determinant() {

    }

    public boolean isSquare() {
        return true;
    }

    public boolean isSymmetric() {
        return true;
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }
}
