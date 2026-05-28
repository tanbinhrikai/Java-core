package bai16;

import java.util.Scanner;

public class Main {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();
        String[] sinhvien = new String[n];
        for (int i = 0;i<n;i++){
            System.out.println("nhap sv thu " + (i+1));
            sinhvien[i] = scanner.nextLine();

        }

        for(int i=0;i<n-1;i++){
            for(int j = 0;j<n-i-1;j++){
                if(
                        Double.parseDouble(sinhvien[j].replace("(", "").replace(")", "").split(",")[1])
                        < Double.parseDouble(sinhvien[j+1].replace("(", "").replace(")", "").split(",")[1])
                ){
                    String temp = sinhvien[j];
                    sinhvien[j] = sinhvien[j+1];
                    sinhvien[j+1] = temp;
                }else if(
                        Double.parseDouble(sinhvien[j].replace("(", "").replace(")", "").split(",")[1])
                                == Double.parseDouble(sinhvien[j+1].replace("(", "").replace(")", "").split(",")[1])
                ){
                    if(
                            sinhvien[j].replace("(", "").replace(")", "").split(",")[0].compareTo(
                                    sinhvien[j+1].replace("(", "").replace(")", "").split(",")[0]
                            ) < 0
                    ){
                        String temp = sinhvien[j];
                        sinhvien[j] = sinhvien[j+1];
                        sinhvien[j+1] = temp;
                    }
                }
            }
        }

        for(int i=0;i<n;i++){
            System.out.println(sinhvien[i] + " ");
        }
    }
}
