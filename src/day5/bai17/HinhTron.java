package day5.bai17;

// Lớp con kế thừa (IS-A)
public class HinhTron extends HinhHoc {
    private double banKinh;

    public HinhTron(double banKinh) {
        super("Hình Tròn"); // Gọi constructor của cha
        this.banKinh = banKinh;
    }

    @Override
    public double tinhDienTich() {
        return Math.PI * banKinh * banKinh;
    }
}
