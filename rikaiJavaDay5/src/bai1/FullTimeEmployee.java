package bai1;

public class FullTimeEmployee extends NhanVien {

    private int bonus;

    public FullTimeEmployee(
            String name,
            int baseSalary,
            String department,
            int bonus
    ) {
        super(name, baseSalary, department);
        this.bonus = bonus;
    }

    @Override
    public int calculateSalary() {
        return getBaseSalary() + bonus;
    }
}