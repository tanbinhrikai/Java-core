package day5.bai16;

public abstract class Vehicle {
    private String brand;
    private int year;

    public Vehicle(String brand, int year) {
        this.brand = brand;
        this.year = year;
        System.out.println("[Vehicle] Brand: " + brand + " Year: " + year + "(Constructor");
    }

    public void move() {
        System.out.println("[Vehicle]rolling");
    }
}
