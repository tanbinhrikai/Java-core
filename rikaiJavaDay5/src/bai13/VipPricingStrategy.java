package bai13;

public class VipPricingStrategy implements PricingStrategy {

    private static final double DISCOUNT_RATE = 0.20;
    private static final double VOUCHER_AMOUNT = 50_000;

    @Override
    public double calculatePrice(double originalPrice) {

        double discountedPrice =
                originalPrice * (1 - DISCOUNT_RATE);

        return Math.max(0, discountedPrice - VOUCHER_AMOUNT);
    }
}