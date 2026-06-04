package day4.bai18;

public class Main {
    static void main() {
        DienThoai dienThoai = new DienThoai();

        Observer tinNhan = new TinNhan();
        Observer cuocGoi = new CuocGoi();
        Observer pinYeu = new PinYeuObserver();

        dienThoai.attach(tinNhan);
        dienThoai.attach(cuocGoi);
        dienThoai.attach(pinYeu);

        dienThoai.setMucPin(15);
        dienThoai.goiDienThoai();

        dienThoai.detach(pinYeu);
        dienThoai.setMucPin(5);

    }
}
