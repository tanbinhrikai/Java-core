package bai4;

public class TuoiKhongHopLeException extends RuntimeException {

    public TuoiKhongHopLeException(int tuoi, int tuoiToiThieu) {
        super("Tuoi " + tuoi + " khong hop le. Phai >= " + tuoiToiThieu);
    }
}