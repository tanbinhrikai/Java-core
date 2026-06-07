package bai13;

public class RegularPricingStrategy implements PricingStrategy {

    @Override
    public double calculatePrice(double originalPrice) {
        return originalPrice;
    }
}