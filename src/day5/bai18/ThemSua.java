package day5.bai18;

public class ThemSua extends CaPheDecorator {

    ThemSua(CaPhe caPhe) {
        super(caPhe);
    }

    @Override
    public String moTa() {
        return caPhe.moTa() + " Sua";
    }

    @Override
    public double gia() {
        return caPhe.gia() + 5000;
    }
}
