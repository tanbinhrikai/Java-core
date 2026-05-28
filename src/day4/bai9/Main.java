package day4.bai9;

public class Main {
    static void main() {
        QuanLySinhVien quanLySinhVien = new QuanLySinhVien();

        SinhVien sv1 = new SinhVien("SV001", "Buiua", 7.5, "Kha");
        SinhVien sv7 = new SinhVien("SV009", "laciz", 8.2, "Gioi");
        SinhVien sv2 = new SinhVien("SV002", "Huynh", 9.1, "Xuat sac");
        SinhVien sv3 = new SinhVien("SV003", "HIuavz", 5.1, "Trung binh");
        SinhVien sv4 = new SinhVien("SV004", "Annnnn", 3.5, "Yeu");
        SinhVien sv5 = new SinhVien("SV005", "Ainh", 7.5, "Kha"); // Trùng điểm sv1

        quanLySinhVien.them(sv1);
        quanLySinhVien.them(sv2);
        quanLySinhVien.them(sv3);
        quanLySinhVien.them(sv4);
        quanLySinhVien.them(sv5);
        quanLySinhVien.them(sv7);

        quanLySinhVien.sapXepTheoDiem();
//        quanLySinhVien.xoa(sv2);

        quanLySinhVien.inBangDiem();

        quanLySinhVien.thongKe();

    }
}
