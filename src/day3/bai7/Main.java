package day3.bai7;

public class Main {
    static void main() {
        int[][] mat = {{12,34,56,78},{90,11,23,45},{67,89,1,34}};

        System.out.println("Ma tran 3x4");
        for(int i = 0; i < mat.length; i++) {
            for(int j = 0; j < mat[i].length; j++) {
                System.out.printf("%d \t", mat[i][j]);
            }
            System.out.println("");
        }

        System.out.print("Tong hang: ");
        for(int i = 0; i < mat.length; i++) {
            int sum = 0;
            for(int j = 0; j < mat[i].length; j++) {
                sum += mat[i][j];
            }
            System.out.printf(" %d |", sum);
        }

        System.out.println("");
        System.out.print("Tong cot: ");
        for(int j = 0; j < mat[0].length; j++) {
            int sum = 0;
            for (int i = 0; i < mat.length; i++) {
                sum += mat[i][j];
            }
            System.out.printf(" %d | ", sum);
        }
    }
}
