package day4.bai4;

public class Sach {
    private String tieuDe;
    private String tacGia;
    private int nxb;
    private int nam;
    private int isbn;
    private int soTrang;
    private double giaBan;

    public static class Builder {
        private String tieuDe;
        private String tacGia;
        private int nxb;
        private int nam;
        private int isbn;
        private int soTrang;
        private double giaBan;

        public Builder tieuDe(String tieuDe) {
            this.tieuDe = tieuDe;
            return this;
        }

        public Builder tacGia(String tacGia) {
            this.tacGia = tacGia;
            return this;
        }

        public Builder nxb(int nxb) {
            this.nxb = nxb;
            return this;
        }

        public Builder nam(int nam) {
            this.nam = nam;
            return this;
        }

        public Builder isbn(int isbn) {
            this.isbn = isbn;
            return this;
        }

        public Builder soTrang(int soTrang) {
            this.soTrang = soTrang;
            return this;
        }

        public Builder giaBan(double giaBan) {
            this.giaBan = giaBan;
            return this;
        }

        public Sach build() {
            return new Sach(this);
        }
    }

    private Sach(Builder builder) {
        this.tieuDe = builder.tieuDe;
        this.tacGia = builder.tacGia;
        this.nxb = builder.nxb;
        this.nam = builder.nam;
        this.isbn = builder.isbn;
        this.soTrang = builder.soTrang;
        this.giaBan = builder.giaBan;
    }

    @Override
    public String toString() {
        return "Sach{" +
                "tieuDe='" + tieuDe + '\'' +
                ", tacGia='" + tacGia + '\'' +
                ", nxb=" + nxb +
                ", nam=" + nam +
                ", isbn=" + isbn +
                ", soTrang=" + soTrang +
                ", giaBan=" + giaBan +
                '}';
    }
}
