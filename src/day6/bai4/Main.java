package day6.bai4;

public class Main {
    static void main() {
        HeThongDatVe heThongDatVe = new HeThongDatVe();
        try {
            heThongDatVe.datVe("CONCERT", 5);

        } catch (HetVeException hetVeException) {
            System.err.println(hetVeException.getMessage());
        }

        try {
            heThongDatVe.underage(15);
        } catch(TuoiKhongHopLeException e) {
            System.err.println(e.getMessage());
        }

        try {
            heThongDatVe.thanhToan(-100);
        } catch (ThanhToanException e) {
            System.err.println(e.getMessage());
        }

    }
}
