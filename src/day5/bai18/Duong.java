package day5.bai18;

public class Duong extends CaPheDecorator {

    Duong(CaPhe caPhe) {
        super(caPhe);
    }


    @Override
    public String moTa() {
        return caPhe.moTa() + " duong";
    }

    @Override
    public double gia() {
        return caPhe.gia() + 2000;
    }
}
