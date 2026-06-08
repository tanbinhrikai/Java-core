package bai13;

public class Order {

    private final double originalPrice;

    private PricingStrategy pricingStrategy;

    public Order(
            double originalPrice,
            PricingStrategy pricingStrategy
    ) {
        this.originalPrice = originalPrice;
        this.pricingStrategy = pricingStrategy;
    }

    public void setPricingStrategy(
            PricingStrategy pricingStrategy
    ) {
        this.pricingStrategy = pricingStrategy;
    }

    public double calculateTotal() {
        return pricingStrategy.calculatePrice(originalPrice);
    }
}