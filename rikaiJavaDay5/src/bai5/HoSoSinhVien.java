package bai5;

public class HoSoSinhVien implements Printable,SaveAble{
    private String name;

    public HoSoSinhVien(String name) {
        this.name = name;
    }
    @Override
    public void print() {
        System.out.println("Ho Sinh Vien");
    }

    @Override
    public void printToFile(String fileName) {


    }

    @Override
    public void save() {

    }

    @Override
    public void load(String source) {

    }
}
