package bai10;

public abstract class BaoCao {

    public final void taoFile() {
        taoTieuDe();
        taoNoiDung();
        taoKyQuen();
    }

     abstract void taoTieuDe();

     abstract void taoNoiDung();

     void taoKyQuen() {

     }
}