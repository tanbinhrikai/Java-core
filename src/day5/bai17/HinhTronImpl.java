package day5.bai17;

public class HinhTronImpl implements IHInhHoc{
    private double banKinh;

    public HinhTronImpl(double banKinh) {
        this.banKinh = banKinh;
    }
    @Override
    public double tinhDienTich() {
        return Math.PI * banKinh * banKinh;
    }
}
