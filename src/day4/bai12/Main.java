package day4.bai12;

public class Main {
    static void main() {
        int[][] a = {{1,2}, {3,4}};
        int[][] b = {{5,9}, {1,4}};

        int[][] c = {{1,2,3}, {2,5,6}, {3,6,7}};

        Matrix m1 = new Matrix(a);
        Matrix m2 = new Matrix(b);

        Matrix mcc = new Matrix(c);

        Matrix m3 = m1.add(m2);
        System.out.println(m3);

        Matrix m4 = m1.multiply(m2);
        System.out.println(m4);

        m1.transpose();

        System.out.println("Ma tran vuong " + mcc.isSquare());
        System.out.println("Ma tran doi xung " + mcc.isSymmetric());
        System.out.println("determinant: " + m2.determinant());
    }
}
