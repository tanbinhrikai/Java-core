package bai13;

public class Main {

    public static void main(String[] args) {

        Order order =
                new Order(
                        500_000,
                        new RegularPricingStrategy()
                );

        System.out.println(
                "Regular: " + order.calculateTotal()
        );

        order.setPricingStrategy(
                new MemberPricingStrategy()
        );

        System.out.println(
                "Member: " + order.calculateTotal()
        );

        order.setPricingStrategy(
                new VipPricingStrategy()
        );

        System.out.println(
                "VIP: " + order.calculateTotal()
        );

        order.setPricingStrategy(
                new FlashSalePricingStrategy()
        );

        System.out.println(
                "Flash Sale: " + order.calculateTotal()
        );
    }
}