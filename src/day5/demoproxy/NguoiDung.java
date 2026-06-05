package day5.demoproxy;

public class NguoiDung {
    private String tenDangNhap;
    private boolean laPremium;

    public NguoiDung(String tenDangNhap, boolean laPremium) {
        this.tenDangNhap = tenDangNhap;
        this.laPremium = laPremium;
    }
    public String getTenDangNhap() { return tenDangNhap; }
    public boolean isPremium() { return laPremium; }
}
