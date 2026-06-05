package day5.bai4;

public class Main {
    static void main() {
        HinhHoc hinhTron = new HinhTron(5);
        hinhTron.moTa();
        System.out.printf("S = %.2f, C = %.2f %n", hinhTron.dienTich(), hinhTron.chuVi());

        HinhHoc hinhChuNhat = new HinhChuNhat(4, 6);
        hinhChuNhat.moTa();
        System.out.printf("S = %.2f, C = %.2f", hinhChuNhat.dienTich(), hinhChuNhat.chuVi());

    }
}
