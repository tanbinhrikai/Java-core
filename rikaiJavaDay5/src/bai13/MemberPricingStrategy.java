package bai13;

public class MemberPricingStrategy implements PricingStrategy {

    private static final double DISCOUNT_RATE = 0.10;

    @Override
    public double calculatePrice(double originalPrice) {
        return originalPrice * (1 - DISCOUNT_RATE);
    }
}