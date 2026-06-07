package bai18;

public class Espresso implements Coffee {

    @Override
    public String getDescription() {
        return "Espresso";
    }

    @Override
    public double getPrice() {
        return 25_000;
    }
}