package day4.bai20;

import java.util.Arrays;

public class DocGia {
    private String maDocGia;
    private String ten;
    private String email;
    private Sach[] sachDangMuon;

    public DocGia(String maDocGia, String ten, String email, Sach[] sachDangMuon) {
        this.maDocGia = maDocGia;
        this.ten = ten;
        this.email = email;
        this.sachDangMuon = sachDangMuon;
    }

    public DocGia(String maDocGia, String ten, String email) {
        this.maDocGia = maDocGia;
        this.ten = ten;
        this.email = email;
    }

    public String getMaDocGia() {
        return maDocGia;
    }

    public void setMaDocGia(String maDocGia) {
        this.maDocGia = maDocGia;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Sach[] getSachDangMuon() {
        return sachDangMuon;
    }

    public void setSachDangMuon(Sach[] sachDangMuon) {
        this.sachDangMuon = sachDangMuon;
    }

    @Override
    public String toString() {
        return "DocGia{" +
                "maDocGia='" + maDocGia + '\'' +
                ", ten='" + ten + '\'' +
                ", email='" + email + '\'' +
                ", sachDangMuon=" + Arrays.toString(sachDangMuon) +
                '}';
    }
}
