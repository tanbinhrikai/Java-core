package bai4;

import bai2.Main;

public class HinhTron extends HinhHoc{
    private double r;
    public HinhTron(double r) {
        this.r = r;
    }

    @Override
    public double dientich() {
        return Math.PI*r*r;
    }

    @Override
    public double chuvi() {
        return 2*Math.PI*r;
    }

    @Override
    public String tenHinh() {
        return "hinh tron";
    }
}
