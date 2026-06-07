package bai4;

public class HeThongDatVe {

    public static void datVe(String event, int soVeYeuCau)
            throws HetVeException {

        int soVeConLai = 2;

        if (soVeYeuCau > soVeConLai) {
            throw new HetVeException(event, soVeConLai);
        }

        System.out.println("Dat ve thanh cong");
    }

    public static void kiemTraTuoi(int tuoi) {

        int tuoiToiThieu = 18;

        if (tuoi < tuoiToiThieu) {
            throw new TuoiKhongHopLeException(tuoi, tuoiToiThieu);
        }

        System.out.println("Tuoi hop le");
    }

    public static void thanhToan(double soTien) {

        if (soTien < 0) {
            throw new ThanhToanException("So tien am");
        }

        System.out.println("Thanh toan thanh cong");
    }
}