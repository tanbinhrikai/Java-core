package bai16;

public abstract class Vehicle {

    protected String brand;
    protected int year;

    public Vehicle(String brand, int year) {
        this.brand = brand;
        this.year = year;

        System.out.println("constructor vehicle");

    }

    public void move() {
        System.out.print("[Vehicle] rolling");
    }
}