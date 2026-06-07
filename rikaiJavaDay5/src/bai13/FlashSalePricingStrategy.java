package bai13;

public class FlashSalePricingStrategy implements PricingStrategy {

    private static final double DISCOUNT_RATE = 0.30;

    @Override
    public double calculatePrice(double originalPrice) {
        return originalPrice * (1 - DISCOUNT_RATE);
    }
}