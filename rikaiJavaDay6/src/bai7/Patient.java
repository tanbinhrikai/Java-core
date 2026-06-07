package bai7;

public class Patient implements Comparable<Patient> {

    private final String name;
    private final int priorityLevel;

    public Patient(String name, int priorityLevel) {
        this.name = name;
        this.priorityLevel = priorityLevel;
    }

    public String getName() {
        return name;
    }

    public int getPriorityLevel() {
        return priorityLevel;
    }

    @Override
    public int compareTo(Patient other) {
        return Integer.compare(
                this.priorityLevel,
                other.priorityLevel
        );
    }

    @Override
    public String toString() {
        return name + "(" + priorityLevel + ")";
    }
}