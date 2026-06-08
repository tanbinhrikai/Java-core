package bai6;

public class TemperatureSensor implements Comparable<TemperatureSensor> {

    private double temperature;

    private final double MIN = 0;
    private final double MAX = 30;

    private static int warningCount = 0;

    public TemperatureSensor(double temperature) {
        setTemperature(temperature);
    }

    public void setTemperature(double temperature) {
        if (temperature < MIN || temperature > MAX) {
            System.out.println("WARNING: Temperature out of safe range!");
            warningCount++;
        }
        this.temperature = temperature;
    }

    public double getTemperature() {
        return temperature;
    }

    public static int getWarningCount() {
        return warningCount;
    }

    public TemperatureSensor toFahrenheit() {
        double result = (9.0 / 5) * temperature + 32;
        return new TemperatureSensor(result);
    }

    public TemperatureSensor toKelvin() {
        double result = temperature + 273.15;
        return new TemperatureSensor(result);
    }

    @Override
    public int compareTo(TemperatureSensor other) {
        return Double.compare(this.temperature, other.temperature);
    }
}