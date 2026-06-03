package day4.bai10;

public class Main {
    static void main() {
        for(Vaitro v : Vaitro.values()) {
            System.out.printf("VaiTro.%s: %s, muc = %d, chinh_sua=%b %n", v.getByMucDo(v.getMucDoTruyCap()), v.tenHienThi(), v.getMucDoTruyCap(), v.coQuyenChinhSua());;
        }
    }
}
