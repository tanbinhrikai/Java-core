package day5.bai18;

public class Da extends CaPheDecorator {

    Da(CaPhe caPhe) {
        super(caPhe);
    }

    @Override
    public String moTa() {
        return caPhe.moTa() + " da";
    }

    @Override
    public double gia() {
        return caPhe.gia() + 3000;
    }
}
