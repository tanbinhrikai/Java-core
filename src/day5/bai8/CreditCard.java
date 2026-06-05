package day5.bai8;

public class CreditCard extends Payment{
    String soThe;
    String bank;

    public CreditCard() {
    }

    public CreditCard(double amount, String currency, String soThe, String bank) {
        super(amount, currency);
        this.soThe = soThe;
        this.bank = bank;
    }

    public void applyDiscount() {
        System.out.println("OK + giam 5%");
    }

    @Override
    void process() {
        System.out.println("Thanh toan the tin dung...");
    }
}
