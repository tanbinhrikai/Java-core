package day3.bai8;

public class Main {
    static void main() {
        int[][] a = {{1,2,3}, {4,5,6}};
        int[][] b = {{7,8}, {9, 10}, {11,12}};

        int[][] c = new int[a.length][b[0].length];

        for(int i = 0; i < a.length; i++) {
            for(int j = 0; j < b[0].length; j++) {
                int sum = 0;
                for(int k = 0; k < a[0].length; k++) {
                    sum += a[i][k] * b[k][j];
                }
                c[i][j] = sum;
            }
        }

        for(int i = 0; i < c.length; i++) {
            for(int j = 0; j < c.length; j++) {
                System.out.printf("%d ", c[i][j]);
            }
            System.out.println("");
        }
    }
}
