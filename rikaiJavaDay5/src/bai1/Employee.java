package bai1;

public abstract class Employee {

    private String name;
    private int baseSalary;
    private String department;

    public Employee(String name, int baseSalary, String department) {
        this.name = name;
        this.baseSalary = baseSalary;
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public int getBaseSalary() {
        return baseSalary;
    }

    public String getDepartment() {
        return department;
    }

    public abstract int calculateSalary();
}