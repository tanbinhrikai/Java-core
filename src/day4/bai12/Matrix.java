package day4.bai12;

import java.util.Arrays;

public class Matrix {
    private final int[][] data;
    private final int rows;
    private final int cols;

    public Matrix(int[][] data) {
        this.data = data;
        this.rows = data.length;
        this.cols = data[0].length;
    }

    public Matrix add(Matrix other) {
        int[][] res = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                res[i][j] = this.data[i][j] + other.data[i][j];
            }
        }
        return new Matrix(res);
    }

    public Matrix multiply(Matrix other) {
        int[][] res = new int[rows][rows];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                int c = 0;
                for (int k = 0; k < rows; k++) {
                    c = c + this.data[i][k] * other.data[k][j];
                }
                res[i][j] = c;
            }
        }

        return new Matrix(res);
    }

    public void transpose() {
        int[][] newMatrix = new int[cols][rows];
        for(int i = 0; i < rows; i++) {
            for(int j = 0; j < cols; j++) {
                newMatrix[j][i] = this.data[i][j];
            }
        }

        System.out.println("Ma tran sau khi chuyen vi");
        System.out.println(new Matrix(newMatrix));
    }

    public int determinant() {
        int a1 = 0;
        for(int  i =0; i < this.data.length; i++) {

            a1 += this.data[i][i];
        }

        int a2 = 0;
        for(int i = 0; i  < this.data.length; i++) {
            a2 += this.data[i][rows - i - 1];
        }
        return a1 - a2;
    }

    public boolean isSquare() {
        return rows == cols;
    }

    public boolean isSymmetric() {
        for(int i = 0; i < rows; i++) {
            for(int j = 0; j < cols; j++) {
                if(this.data[i][j] != this.data[j][i]) {
                    return false;
                }
            }
        }
        return true;
    }

    @Override
    public String toString() {
        String s = "";
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                s = s + String.format("%d\t", data[i][j]);
            }
            s = s + "\n";
        }
        return s;
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
