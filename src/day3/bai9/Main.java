package day3.bai9;

public class Main {
    static void main() {
        HinhHoc hinhHoc = new HinhHoc();
        System.out.printf("dienTich(%.2f) = %f (hinh tron) %n", 5.0, hinhHoc.dientich(5));

        System.out.printf("dienTich(%d, %d) = %f (hinh chu nhat) %n", 4, 6, hinhHoc.dientich(4,6));

        System.out.printf("dienTich(%d, %d, %d) = %f (Tam giac)", 3, 4, 5, hinhHoc.dientich(3,4,5));

    }
}
