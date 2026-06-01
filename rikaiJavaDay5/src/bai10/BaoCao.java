package bai10;

public abstract class BaoCao {
    final void taoFile(){
        taoTieuDe();
        taoNoidung();
        taoKyQuen();
    }

    public abstract void taoTieuDe();
    public abstract  void taoNoidung();

    public void taoKyQuen(){
        System.out.println("default rong");
    }

}

