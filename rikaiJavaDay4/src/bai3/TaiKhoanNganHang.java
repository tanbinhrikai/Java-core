package bai3;

public class TaiKhoanNganHang {
    private String soTK;
    private String chuSoHuu;
    private double soDu;
    private double laiSuat;

    public static final double THIEU_TIEN_PENALTY = 0.01;

    private static int dem = 1;

    public TaiKhoanNganHang(String chuSoHuu, double soDu, double laiSuat) {
        this.soTK = taoSoTK();
        this.chuSoHuu = chuSoHuu;
        this.soDu = soDu;
        this.laiSuat = laiSuat;
    }

    public String getSoTK() {
        return soTK;
    }

    public String getChuSoHuu() {
        return chuSoHuu;
    }

    public double getSoDu() {
        return soDu;
    }

    public double getLaiSuat() {
        return laiSuat;
    }

    public void napTien(double so) {
        if (so > 0) {
            soDu += so;
        } else {
            System.out.println("So tien nap phai duong");
        }
    }

    public void rutTien(double so) {
        if (so <= soDu) {
            soDu -= so;
        } else {
            System.out.println("Loi: So du khong du!");
        }
    }

    public void tinhLaiHangThang() {
        soDu += soDu * laiSuat;
        System.out.println("Sau khi tinh lai -> Du: " + soDu);
    }



    public static String taoSoTK() {
        String ma = String.format("VCB-2024-%03d", dem);
        dem++;
        return ma;
    }
}