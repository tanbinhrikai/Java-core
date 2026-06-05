package day5.bai8;

public abstract class Payment {
    double amount;
    String currency;

    public Payment(double amount, String currency) {
        this.amount = amount;
        this.currency = currency;
    }

    public Payment() {
    }

    abstract void process();
}
