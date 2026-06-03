package day4.bai20;

public class Main {
    static void main() {
        ThuVien thuVien = new ThuVien();


        Sach sach1 = new Sach("ISBN-001", "HIHI-HAHA", "Duy", 3, 0);
        thuVien.themSach(sach1);

        thuVien.muonSach("DG001", "ISBN-001");
        thuVien.muonSach("DG002", "ISBN-001");
        thuVien.muonSach("DG003", "ISBN-001");
        thuVien.muonSach("DG004", "ISBN-001");

        thuVien.traSach("DG001", "ISBN-001");


    }
}
