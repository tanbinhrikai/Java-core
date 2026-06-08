package bai16;

public class Car extends Vehicle {

    protected String fuelType;
    protected int numberOfDoors;

    public Car(
            String brand,
            int year,
            String fuelType,
            int numberOfDoors
    ) {
        super(brand, year);

        this.fuelType = fuelType;
        this.numberOfDoors = numberOfDoors;
        System.out.println("constructor car");


    }

    @Override
    public void move() {
        super.move();
        System.out.print(" -> [Car] accelerating");
    }
}