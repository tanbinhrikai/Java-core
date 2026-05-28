package day4.bai9;

public class SinhVien {
    private String maSV;
    private String hoTen;
    private double score;
    private String xepLoai;

    public SinhVien(String maSV, String hoTen, double score, String xepLoai) {
        this.maSV = maSV;
        this.hoTen = hoTen;
        this.score = score;
        this.xepLoai = xepLoai;
    }

    public String getMaSV() {
        return maSV;
    }

    public void setMaSV(String maSV) {
        this.maSV = maSV;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public String getXepLoai() {
        return xepLoai;
    }

    public void setXepLoai(String xepLoai) {
        this.xepLoai = xepLoai;
    }

    @Override
    public String toString() {
        return String.format("%s\t\t%s\t\t%.2f\t\t%s %n", maSV, hoTen, score, xepLoai);
    }
}
