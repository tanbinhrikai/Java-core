package bai1;

import java.util.Scanner;

public class Main {
    private final String YEU = " Yếu ";
    private final String STRUNG_BINH = "Trung Bình";
    private final String KHA = "Khá";
    private final String GIOI = "Giỏi";
    private final String SUATSAC = "Suất Sắc";
    public void main(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập điểm của bạn");
        double diem = scanner.nextDouble();
        System.out.printf("phân loại của %.2f là : %s",diem,phanLoai(diem));
    }

    public String  phanLoai(double diemSo){
        if(diemSo<5) return YEU;
        else if (diemSo > 6 && diemSo < 6.5) {
            return  STRUNG_BINH;
            
        } else if (diemSo >6.5 && diemSo < 8.5) {
            return KHA;

        }else if (diemSo >8.5 && diemSo <9){
            return  GIOI;
        }
        else {
            return  SUATSAC;
        }

    }
}
