package bai7;

public class Main {
    static void main() {
        int rows = 3;
        int cols = 4;
        int[][] matran = new int[rows][cols];
        for (int hang = 0; hang <rows; hang++){
            for(int cot=0;cot<cols;cot++){
                 matran[hang][cot] = (int) (Math.random()*99 +1);
            }
        }
        System.out.println("Ma tran:");

        for (int i = 0; i < rows; i++) {

            for (int j = 0; j < cols; j++) {

                System.out.printf("%3d ", matran[i][j]);
            }

            System.out.println();
        }


        System.out.println("tong hang ");



        for (int hang=0; hang<rows;hang++){
            System.out.println("hang " + (hang+1));
            int sum = 0;
            for(int cot=0; cot< cols;cot++){
                sum+=matran[hang][cot];
            }
            System.out.println(sum);

        }

        System.out.println("tong cot ");
        for(int cot = 0 ; cot<cols;cot++){
            System.out.println("cot "+ cot);
            int sum = 0;
            for(int hang = 0; hang<rows;hang++){
                sum+= matran[hang][cot];
            }
            System.out.println(sum);
        }


        // đường chéo
        if(rows==cols){
            int sum = 0;
            System.out.println("tổng đường chéo là : ");
            for(int i =0;i< rows;i++){
                sum+=matran[i][i];
            }
            System.out.println(sum);
        }else {
            System.out.println("khong  phải hinh vuông nên không có đường chéo ");
        }


        // tìm phần tử lớn nhát
        int max = matran[0][0];
        int maxrow = 0;
        int maxcol = 0;
        for(int i =0;i<rows;i++){
            for (int j =0;j<cols;j++){
                if(matran[i][j] > max){
                    max  = matran[i][j];
                    maxrow = i;
                    maxcol = j;
                }
            }
        }
        System.out.println("Phan tu lon nhat: " + max);

    }
}
