package day5.bai4;

public abstract class HinhHoc {
    abstract double dienTich();
    abstract double chuVi();
    abstract String tenHinh();

    final void moTa() {
        System.out.print(tenHinh() + " ");
    }

    static HinhHoc hinhHocLonNhat(HinhHoc[] hinh) {
        return null;
    }
}
