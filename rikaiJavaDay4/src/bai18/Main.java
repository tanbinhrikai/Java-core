package bai18;

public class Main {
    public static void main(String[] args) {
        DienThoai dienThoai = new DienThoai();
        dienThoai.attach(new TinNhan());
        dienThoai.attach(new CuocGoi());
        dienThoai.setPin(11);

    }
}
