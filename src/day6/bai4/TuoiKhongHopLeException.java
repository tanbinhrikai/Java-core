package day6.bai4;

public class TuoiKhongHopLeException extends RuntimeException{

    public TuoiKhongHopLeException(int under, int req) {
        super(String.format("TuoiKhongHopLe: Phai >= %d", req));
    }
}
