package bai16;

public class Main {

    public static void main(String[] args) {

        ElectricCar tesla =
                new ElectricCar(
                        "Tesla",
                        2024,
                        100,
                        600
                );

        System.out.println();

        tesla.move();
    }
}