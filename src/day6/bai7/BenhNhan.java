package day6.bai7;

public class BenhNhan {
    String name;
    int mucDoCapCuu;

    public BenhNhan(String name, int mucDoCapCuu) {
        this.name = name;
        this.mucDoCapCuu = mucDoCapCuu;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMucDoCapCuu() {
        return mucDoCapCuu;
    }

    public void setMucDoCapCuu(int mucDoCapCuu) {
        this.mucDoCapCuu = mucDoCapCuu;
    }

    @Override
    public String toString() {
        return "BenhNhan{" +
                "name='" + name + '\'' +
                ", mucDoCapCuu=" + mucDoCapCuu +
                '}';
    }
}
