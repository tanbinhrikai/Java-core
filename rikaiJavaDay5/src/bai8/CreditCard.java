package bai8;

public class CreditCard extends Payment{
    private String cardNumber;
    private String bankName;
    @Override
    public void process() {
        System.out.println("thanh toan bang the tin dung");
    }

    public void applyDiscount() {
        System.out.println("gianr 50%");
    }
}
