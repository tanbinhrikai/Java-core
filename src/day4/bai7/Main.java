package day4.bai7;

public class Main {
    static void main() {
        HoaDon hoaDon = new HoaDon("HD001", "An", 500000, true);

        HoaDon hoaDonWithDiscount = hoaDon.withDiscount(10);
        System.out.println("Hoa don with discount " + hoaDonWithDiscount);
        System.out.println("Hoa don goc " + hoaDon + " (immutable!)");
    }
}
