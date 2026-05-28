package day4.bai3;

public class TaiKhoanNganHang {
    private static int counter = 1;

    public static final double THIEU_TIEN_PENALTY = 0.01;

    private String soTK;
    private String chuSoHuu;
    private double soDu;
    private double laiSuat;

    public TaiKhoanNganHang() {

    }

    public void napTien(double so) {
        if(so > 0) {
            soDu = soDu + so;
            System.out.printf("Nap tien thanh cong -> Du: %,.2f %n", soDu);
        }
        else {
            System.out.println("Chi chap nhan so duong");
        }
    }

    public void rutTien(double so) {
        if(so > soDu) {
            System.out.println("Khong du tien de rut");
        }else {
            soDu = soDu - so;
            System.out.printf("Rut tien thanh cong -> Du: %.2f %n", soDu);
        }
    }

    public void tinhLaiHangThang() {
        System.out.printf("Lai hang thang %.2f ->", laiSuat);
        soDu = soDu + soDu * 0.5 / 100;
        System.out.printf("Du: %,.2f%n", soDu);
    }

    public static String taoSoTK() {
        return String.format("VCB-2024-%05d", counter++);
    }

    @Override
    public String toString() {
        return String.format("TK: %s | Chu:  %s | Du: %,.2f", soTK, chuSoHuu, soDu);
    }

    public TaiKhoanNganHang(String soTK, String chuSoHuu, double soDu, double laiSuat) {
        this.soTK = soTK;
        this.chuSoHuu = chuSoHuu;
        this.soDu = soDu;
        this.laiSuat = laiSuat;
    }
}
