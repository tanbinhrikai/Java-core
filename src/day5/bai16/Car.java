package day5.bai16;

public class Car extends Vehicle {
    String fuelType;
    int numDoors = 4;

    public Car(String brand, int year, String fuelType, int numDoors) {
        super(brand, year);
        System.out.println("[Car] fuelType: " + fuelType + " numDoors: " + numDoors + "(Constructor");
    }

    @Override
    public void move() {
        super.move();
        System.out.println("[CAR] accelerating");
    }
}
