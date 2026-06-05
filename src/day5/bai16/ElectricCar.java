package day5.bai16;

public class ElectricCar extends Car {
    int batteryCapacity;
    int range;

    public ElectricCar(String brand, int year, int batteryCapacity, int range) {
        super(brand, year, "Electric", 4);
        System.out.println("[ElectricCar] batteryCapacity: " + batteryCapacity + " range: " + range + "(Constructor");
        this.batteryCapacity = batteryCapacity;
        this.range = range;
    }

    @Override
    public void move() {
        super.move();
        System.out.println("[ElectricCar]silent electric");
    }
}
