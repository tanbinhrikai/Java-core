package day5.bai17;

public class HinhCauBayKeThua extends HinhHoc3D{
    public HinhCauBayKeThua(String tenHinh) {
        super(tenHinh);
    }

    @Override
    public double tinhTheTich() {
        return 0;
    }

    @Override
    public double tinhDienTich() {
        return 0;
    }

    // logic phai tu viet k ke thua dc tu dau ca
    public void bay() {}
}
