package day5.bai5;

public class Main {
    static void main() {
        HoSoSinhVien hoSoSinhVien = new HoSoSinhVien();
        hoSoSinhVien.print();
        hoSoSinhVien.printToFile("sv001.txt");
        hoSoSinhVien.save();
        hoSoSinhVien.load("sv001.txt");
    }
}
