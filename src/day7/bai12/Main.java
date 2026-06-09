package day7.bai12;

public class Main {
    static double tinhPhiBaoHiem (Object user) {
        return switch (user) {
            case SinhVien sv when sv.getScore() < 22 -> 50000;
            case SinhVien sv -> 100000;
            case NhanVien nv -> 200000;
            case  null -> throw new NullPointerException();
            default -> 150000;
        };
    }
    public static void main(String[] args) {
        Object user = new SinhVien("An", 20);
        Object user1 = new NhanVien();
        double phi = tinhPhiBaoHiem(user);
        double phi1 = tinhPhiBaoHiem(user1);

        System.out.println(phi);
        System.out.println(phi1);
    }
}
