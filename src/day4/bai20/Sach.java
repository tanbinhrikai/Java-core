package day4.bai20;

public class Sach {
    private String isbn;
    private String tieuDe;
    private String tacGia;
    private Integer soLuong;
    private Integer daChoMuon;

    public Sach(String isbn, String tieuDe, String tacGia, Integer soLuong, Integer daChoMuon) {
        this.isbn = isbn;
        this.tieuDe = tieuDe;
        this.tacGia = tacGia;
        this.soLuong = soLuong;
        this.daChoMuon = daChoMuon;
    }

    public String getIsbn() {
        return isbn;
    }

    public String getTieuDe() {
        return tieuDe;
    }

    public String getTacGia() {
        return tacGia;
    }

    public Integer getSoLuong() {
        return soLuong;
    }

    public Integer getDaChoMuon() {
        return daChoMuon;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public void setTieuDe(String tieuDe) {
        this.tieuDe = tieuDe;
    }

    public void setTacGia(String tacGia) {
        this.tacGia = tacGia;
    }

    public void setSoLuong(Integer soLuong) {
        this.soLuong = soLuong;
    }

    public void setDaChoMuon(Integer daChoMuon) {
        this.daChoMuon = daChoMuon;
    }
}
