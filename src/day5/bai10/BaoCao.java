package day5.bai10;

public abstract class BaoCao {
    // template method with final ngan override toan bo quy trinh

    final void taoFile() {
        taoTieuDe();
        taoNoiDung();
        taoKyQuen();
    }

    abstract void taoTieuDe();
    abstract void taoNoiDung();


    // hook method co implementation mac dinh rong
    public void taoKyQuen() {

    }
}
