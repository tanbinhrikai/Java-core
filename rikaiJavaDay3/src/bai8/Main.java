package bai8;

import java.util.Scanner;

public class Main {

    // nhân hai mai trận
    static void main() {
        Scanner scanner  = new Scanner(System.in);
        System.out.println("nhap so hang va so cot cua ma tran 1 ");
        int rowMatranA = scanner.nextInt();
        int colsMatranA = scanner.nextInt();

        int[][] matranA = new int[rowMatranA][colsMatranA];
        for(int i =0;i<rowMatranA;i++){
            for(int j =0;j<colsMatranA;j++){
                matranA[i][j] = (int) (Math.random() * 12 + 1);
            }
        }


        System.out.println("nhap so hang va cot cua ma tran 2");
        int rowMatranB = scanner.nextInt();
        int colsMatranB = scanner.nextInt();
        int[][] matranB = new int[rowMatranB][colsMatranB];
        for(int i =0;i<rowMatranB;i++){
            for(int j =0;j<colsMatranB;j++){
                matranB[i][j] = (int) (Math.random() * 12 + 1);
            }
        }


        System.out.println("hai ma tran lan luot ;");



        for(int i =0;i<rowMatranA;i++){
            for(int j =0;j<colsMatranA;j++){
                System.out.printf(matranA[i][j] + " ");
            }
            System.out.println(" ");
        }

        System.out.println("\n \n");
        for(int i =0;i<rowMatranB;i++){
            for(int j =0;j<colsMatranB;j++){
                System.out.printf(matranB[i][j] + " ");
            }
            System.out.println("");
        }

        if(colsMatranA != rowMatranB){
            System.out.println("khong thoa man dieu kien de nhan hai ma tran ");
            return;
        }
        int[][] matranC = new int[rowMatranA][colsMatranB];
        for(int i=0;i<rowMatranA;i++){
            for (int j =0;j<colsMatranB;j++){
                int sum = 0;
                for(int k=0;k<colsMatranA;k++){
                    sum= sum + matranA[i][k] * matranB[k][j];
                }
                matranC[i][j] = sum;

            }
        }
        System.out.println("ma tran tich la ");

        for(int i =0;i<rowMatranA;i++){
            for(int j =0;j<colsMatranB;j++){
                System.out.printf(matranC[i][j] + " ");
            }
            System.out.println("");
        }
    }
}
