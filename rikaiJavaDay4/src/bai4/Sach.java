package bai4;

public class Sach {
    private String tieude;
    private String tacGia;
    private String nxb;
    private int nam;
    private String isbn;
    private int soTrang;
    private double giaBan;

    private Sach(Builder builder) {
        this.tieude = builder.tieude;
        this.tacGia = builder.tacGia;
        this.nxb = builder.nxb;
        this.nam = builder.nam;
        this.isbn = builder.isbn;
        this.soTrang = builder.soTrang;
        this.giaBan = builder.giaBan;
    }





    public static class Builder {
        private String tieude;
        private String tacGia;
        private String nxb;
        private int nam;
        private String isbn;
        private int soTrang;
        private double giaBan;

        public Builder(String tieude) {
            this.tieude = tieude;
        }

        public Builder tacGia(String tacGia) {
            this.tacGia = tacGia;
            return this;
        }

        public Builder nxb(String nxb) {
            this.nxb = nxb;
            return this;
        }

        public Builder nam(int nam) {
            this.nam = nam;
            return this;
        }

        public Builder isbn(String isbn) {
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
}