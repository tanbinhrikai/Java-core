package bai17.phienbanA;


public abstract class Shape {

    protected String name;

    public Shape(String name) {
        this.name = name;
    }

    public abstract double calculateArea();

    public void printInfo() {
        System.out.println("Shape: " + name);
    }
}