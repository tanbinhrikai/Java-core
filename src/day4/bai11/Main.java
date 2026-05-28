package day4.bai11;

public class Main {
    static void main() {

        KetNoi taoMoi = KetNoi.taoMoi("localhost", 3306);
        KetNoi taoTuChuoi = KetNoi.taoTuChuoi("192.168.1.1:5432");
        KetNoi taoMacDinh = KetNoi.taoMacDinh();
        KetNoi test = KetNoi.taoMoi("", -5);

        System.out.println("KetNoi.taoMoi(\"localhost\", 3306) -> " + taoMoi);
        System.out.println("KetNoi.taoTuChuoi(\"192.168.1.1:5432\") ->" + taoTuChuoi);
        System.out.println("KetNoi.taoMacDinh() -> " + taoMacDinh);

        System.out.println(taoMoi.isValid());
        System.out.println(test.isValid());

    }
}
