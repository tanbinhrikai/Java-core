package bai7;

public final class HoaDon {
    private final String soHd ;

    private final String khach;
    private  final  double tong;
    private final boolean da_thanh;

    public HoaDon(String soHd,String khach,double tong,boolean da_thanh){
        if (tong <= 0) {
            throw new IllegalArgumentException("Tong phai lon hon 0");
        }
        this.soHd = soHd;
        this.khach = khach;
        this.tong = tong;
        this.da_thanh = da_thanh;
    }

    public HoaDon withDiscount(double pct){
        double discount = this.tong * pct / 100.0 ;
        return new HoaDon(this.soHd ,this.khach , this.tong - discount ,this.da_thanh);
    }

    public boolean isDa_thanh() {
        return da_thanh;
    }

    public double getTong() {
        return tong;
    }

    public String getKhach() {
        return khach;
    }

    public String getSoHd() {
        return soHd;
    }
}
