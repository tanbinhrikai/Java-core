package bai15;

public enum LoaiPhong {

    SINGLER(5),
    DOUBLE(30),
    SUITE(45);

    public int getGiaban() {
        return giaban;
    }

    public void setGiaban(int giaban) {
        this.giaban = giaban;
    }

    private int giaban;


     LoaiPhong(int giaban){
        this.giaban = giaban;
    }
}
