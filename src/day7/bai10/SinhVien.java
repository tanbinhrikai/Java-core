package day7.bai10;

public record SinhVien(String ten, String khoa, double score) {
    public XepLoai getXepLoai() {
        if(score >= 9) return XepLoai.XUAT_XAC;
        else if(score >= 8) return XepLoai.GIOI;
        else if(score >= 6.5) return XepLoai.KHA;
        else if(score >= 5) return XepLoai.TRUNG_BINH;
        else return XepLoai.YEU;
    }
}
