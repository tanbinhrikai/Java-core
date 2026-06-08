package bai8;

public class MoMo extends Payment {

    private String phoneNumber;

    public MoMo(
            double amount,
            String currency,
            String phoneNumber
    ) {
        super(amount, currency);
        this.phoneNumber = phoneNumber;
    }

    @Override
    public void process() {
        System.out.printf(
                "[MoMo %.0f%s] Thanh toán MoMo... OK%n",
                amount,
                currency
        );
    }

    public void sendCashback() {
        System.out.println("Hoàn tiền 2%");
    }
}