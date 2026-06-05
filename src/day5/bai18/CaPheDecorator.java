package day5.bai18;

public abstract class CaPheDecorator implements CaPhe {
    CaPhe caPhe;

    CaPheDecorator(CaPhe caPhe) {
        this.caPhe = caPhe;
    }
}
