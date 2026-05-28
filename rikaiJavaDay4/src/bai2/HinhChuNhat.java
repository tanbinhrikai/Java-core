package bai2;

public class HinhChuNhat {
    private int dai;
    private int rong;

    public HinhChuNhat(int dai, int rong) {
        this.dai = dai;
        this.rong = rong;
    }

    public int getDai() {
        return dai;
    }

    public int getRong() {
        return rong;
    }

    public void setDai(int dai) {
        this.dai = dai;
    }

    public void setRong(int rong) {
        this.rong = rong;
    }

    public int chuVi() {
        return (dai + rong) * 2;
    }

    public int dienTich() {
        return dai * rong;
    }

    public boolean isDuongVuong() {
        return dai == rong;
    }

}