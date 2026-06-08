package bai8;

public class CreditCard extends Payment {

    private String cardNumber;
    private String bankName;

    public CreditCard(
            double amount,
            String currency,
            String cardNumber,
            String bankName
    ) {
        super(amount, currency);
        this.cardNumber = cardNumber;
        this.bankName = bankName;
    }

    @Override
    public void process() {
        System.out.printf(
                "[CreditCard %.0f%s] Thanh toán thẻ tín dụng... OK%n",
                amount,
                currency
        );
    }

    public void applyDiscount() {
        System.out.println("Giảm giá 5%");
    }
}