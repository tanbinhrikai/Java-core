package bai16;

public class ElectricCar extends Car {

    private int batteryCapacity;
    private int range;

    public ElectricCar(
            String brand,
            int year,
            int batteryCapacity,
            int range
    ) {
        super(
                brand,
                year,
                "Electric",
                4
        );

        this.batteryCapacity = batteryCapacity;
        this.range = range;
        System.out.println("constructor electric");


    }

    @Override
    public void move() {
        super.move();
        System.out.println(
                " -> [ElectricCar] silent electric"
        );
    }
}