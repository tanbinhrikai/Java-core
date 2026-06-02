package day6.bai4;

public class HeThongDatVe {
    int soVeConLai = 2;
    int tuoiHopLe = 18;

    public void datVe(String event, int soVeYeuCau) {
        if (soVeYeuCau > soVeConLai) {
            throw new HetVeException(event, soVeConLai);
        }
    }

    public void underage(int i) {
        if(i < 18) {
            throw new TuoiKhongHopLeException(i, tuoiHopLe);
        }

    }

    public void thanhToan(int i) {
        if(i < 0) {
            throw new ThanhToanException();
        }
    }
}
