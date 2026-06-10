package day5.bai17;

public abstract class HinhHoc {
    protected String tenHinh;

    public HinhHoc(String tenHinh) {
        this.tenHinh = tenHinh;
    }

    // ham dung chung lop con k can viet lai cung dc
    public void inThongTin() {
        System.out.println("Đây là: " + tenHinh + " | Diện tích: " + tinhDienTich());
    }

    // lop con ke thua bat buoc phai trien khia
    public abstract double tinhDienTich();
}
