package bai4;

public class TuoiKhongHopLeException extends RuntimeException{
    private String message;
    public TuoiKhongHopLeException(int tuoi,int tuoiToiThieu){
        this.message = "tuoi k hop le: " + "phai lon hon " + tuoiToiThieu;

    }
    @Override
    public String getMessage() {
        return message;
    }
}
