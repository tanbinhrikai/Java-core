package bai1;

public class PartTimeEmployee extends Employee {

    private int workingHours;
    private int hourlyRate;

    public PartTimeEmployee(
            String name,
            int baseSalary,
            String department,
            int workingHours,
            int hourlyRate
    ) {
        super(name, baseSalary, department);
        this.workingHours = workingHours;
        this.hourlyRate = hourlyRate;
    }

    @Override
    public int calculateSalary() {
        return workingHours * hourlyRate;
    }
}