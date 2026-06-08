package bai5;

public class Main {
    public static void main(String[] args) {

        HoSoSinhVien sv = new HoSoSinhVien("SV01", "An", 8.5);

        sv.print();

        sv.printToFile("sv.txt");

        sv.save("sv.json");

        HoSoSinhVien sv2 = new HoSoSinhVien("", "", 0);
        sv2.load("sv.json");

        sv2.print();
    }
}