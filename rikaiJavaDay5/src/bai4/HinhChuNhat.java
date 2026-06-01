package bai4;

public class HinhChuNhat extends HinhHoc{
    private int dai;
    private int rong;
    public HinhChuNhat(int dai, int rong) {
        this.dai = dai;
        this.rong = rong;
    }

    @Override
    public double dientich() {
        return this.dai * this.rong;
    }

    @Override
    public double chuvi() {
        return (this.dai + rong)*2;
    }

    @Override
    public String tenHinh() {
        return "hinh chu nhat";
    }
}
