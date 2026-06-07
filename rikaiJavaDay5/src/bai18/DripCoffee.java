package bai18;

public class DripCoffee implements Coffee {

    @Override
    public String getDescription() {
        return "Drip Coffee";
    }

    @Override
    public double getPrice() {
        return 25_000;
    }
}