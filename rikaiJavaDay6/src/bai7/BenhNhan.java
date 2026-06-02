package bai7;

public class BenhNhan implements Comparable<BenhNhan> {
    private String name;
    private int mucDoCapCuu;

    public String getName() {
        return name;
    }

    public BenhNhan(String name, int mucDoCapCuu) {
        this.name = name;
        this.mucDoCapCuu = mucDoCapCuu;
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
    public int compareTo(BenhNhan o) {
        return Integer.compare(this.getMucDoCapCuu(), o.getMucDoCapCuu());
    }

    @Override
    public String toString() {
        return "BenhNhan [name=" + name + " mucDoCapCuu =" + mucDoCapCuu + " ]";
    }
}
