package day5.bai8;

public class Cash extends Payment{

    public Cash(double amount, String currency) {
        super(amount, currency);
    }

    public Cash() {}

    public void inBienNhan() {
        System.out.println(" Bien nhan");
    }

    @Override
    void process() {
        System.out.println("Thanh toan tien mat");
    }
}
