package day5.bai8;

public class MoMo extends Payment{
    String soDienThoai;

    public MoMo(double amount, String currency, String soDienThoai) {
        super(amount, currency);
        this.soDienThoai = soDienThoai;
    }

    public MoMo() {

    }

    public void sendCashback() {
        System.out.println("+ hoan 2%");
    }

    @Override
    void process() {
        System.out.println("Thanh toan MoMo...OK");
    }
}
