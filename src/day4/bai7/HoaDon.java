package day4.bai7;

public class HoaDon {
    private final String soHoaDon;
    private final String tenKhach;
    private final double tong;
    private final boolean daThanhToan;

    public HoaDon(String soHoaDon, String tenKhach, double tong, boolean daThanhToan) {
        this.soHoaDon = soHoaDon;
        this.tenKhach = tenKhach;
        this.tong = tong;
        this.daThanhToan = daThanhToan;
    }

    public String getSoHoaDon() {
        return soHoaDon;
    }

    public String getTenKhach() {
        return tenKhach;
    }

    public double getTong() {
        return tong;
    }

    public boolean isDaThanhToan() {
        return daThanhToan;
    }

    public HoaDon withDiscount(double pct) {
        return new HoaDon(soHoaDon, tenKhach, tong - pct / 100 * tong, daThanhToan);
    }

    @Override
    public String toString() {
        return "HoaDon{" +
                "soHoaDon='" + soHoaDon + '\'' +
                ", tenKhach='" + tenKhach + '\'' +
                ", tong=" + String.format("%,.2f", tong) +
                ", daThanhToan=" + daThanhToan +
                '}';
    }
}
