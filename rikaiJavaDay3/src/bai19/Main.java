package bai19;

import java.lang.classfile.instruction.SwitchCase;
import java.util.Scanner;

public class Main {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[][] matran = new int[n][n];
        for(int i =0;i<n;i++){
            for(int j=0;j<n;j++){
                matran[i][j] = (int)(Math.random() * 12 +1);

            }
        }

    }

    static boolean matrandoixung(int[][] matran , int n){
        boolean isCheck  = true;
        for(int i=0;i<n;i++){
            for(int  j=0;j<n;j++  ){
                if(i ==j) {
                    continue;
                }
                if(matran[i][j]!=matran[j][i]){
                    isCheck = false;
                }
            }
        }
        return isCheck;
    }


    static boolean matrandonvi(int[][] matran, int n){
        boolean isCheck = true;
        for (int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if((i==j && matran[i][j]!=1)|| (i!=j && matran[i][j]!=0)){
                    isCheck = false;

                }

            }
        }
        return isCheck;
    }

    static boolean matranduongcheo(int[][] matran, int n){
        boolean isCheck = true;
        for(int i=0;i<n;i++){
            for(int j =0;j<n;j++){
                if(i!=j && matran[i][j]!=0){
                    isCheck = false;
                }
            }
        }
        return  isCheck;
    }
}
