package day4.bai20;

public class Main {
    static void main() {
//        ThuVien thuVien = new ThuVien();
//
//        Sach sach1 = new Sach("ISBN-001", "HIHI-HAHA", "Duy", 3, 0);
//        thuVien.themSach(sach1);
//
//        thuVien.muonSach("DG001", "ISBN-001");
//        thuVien.muonSach("DG002", "ISBN-001");
//        thuVien.muonSach("DG003", "ISBN-001");
//        thuVien.muonSach("DG004", "ISBN-001");
//
//        thuVien.traSach("DG001", "ISBN-001");

        ThuVien tv = new ThuVien();

        System.out.println("--- BẮT ĐẦU KIỂM THỬ HỆ THỐNG THƯ VIỆN --- \n");

        System.out.println(">>> [Test Case 1] Thêm sách vào thư viện...");
        // Thêm các cuốn sách với số lượng khác nhau
        tv.themSach(new Sach("978-1", "Lap trinh Java nang cao", "Tac Gia A", 3));
        tv.themSach(new Sach("978-2", "Cau truc du lieu va Giai thuat", "Tac Gia B", 1)); // Số lượng = 1 để test hết sách
        tv.themSach(new Sach("978-3", "Huong doi tuong voi C++", "Tac Gia C", 5));
        tv.inDanhSach();
        System.out.println();

        System.out.println(">>> [Test Case 2] Thêm độc giả...");
        tv.themDocGia(new DocGia("DG001", "Nguyen Van Anh", "anhnv@email.com"));
        tv.themDocGia(new DocGia("DG002", "Tran Thi Binh", "binhtt@email.com"));
        tv.inDanhSach();
        System.out.println();

        // =========================================================================
        // 4. TEST CASE: TÌM KIẾM SÁCH (timSach)
        // =========================================================================
        System.out.println(">>> [Test Case 3] Tìm kiếm sách theo từ khóa...");
        System.out.println("Tìm kiếm từ 'Java':");
        System.out.println(tv.timSach("Java"));


        System.out.println("Tìm kiếm từ không tồn tại 'Python':");
        System.out.println(tv.timSach("Python"));
        System.out.println();

        // =========================================================================
        // 5. TEST CASE: MƯỢN SÁCH (muonSach) - Các kịch bản thành công và lỗi
        // =========================================================================
        System.out.println(">>> [Test Case 4] Mượn sách...");

        // Kịch bản 4.1: Mượn thành công
        System.out.println("- Độc giả DG001 mượn sách Java (978-1):");
        tv.muonSach("DG001", "978-1");


        // Kịch bản 4.2: Một độc giả mượn tiếp cuốn khác (Thành công)
        System.out.println("- Độc giả DG001 mượn tiếp sách C++ (978-3):");
        tv.muonSach("DG001", "978-3");

        // Kịch bản 4.5: Mượn hết sách (Sách CTDL&GT chỉ có 1 cuốn)
        System.out.println("- Độc giả DG001 mượn cuốn CTDL&GT (978-2) -> Thành công:");
        tv.muonSach("DG001", "978-2");

        System.out.println("- Độc giả DG002 mượn tiếp cuốn CTDL&GT (978-2) -> Phải báo LỖI do hết sách:");
        tv.muonSach("DG002", "978-2");

        // In trạng thái để kiểm tra số lượng daChoMuon và danh sách sachDangMuon[]
        System.out.println("\n--- Trạng thái thư viện sau khi mượn sách ---");
        tv.inDanhSach();
        System.out.println();

        System.out.println(">>> [Test Case 5] Trả sách...");

        // Kịch bản 5.1: Trả thành công
        System.out.println("- Độc giả DG001 trả sách Java (978-1) -> Thành công:");
        tv.traSach("DG001", "978-1");

// Kịch bản 5.3: Độc giả DG002 mượn lại cuốn CTDL&GT vừa được giải phóng chưa?
        System.out.println("- Sau khi DG001 trả sách Java, DG001 vẫn giữ cuốn CTDL&GT (978-2).");
        System.out.println("- Độc giả DG001 trả nốt cuốn CTDL&GT (978-2) -> Thành công:");
        tv.traSach("DG001", "978-2");

        System.out.println("- Bây giờ độc giả DG002 mượn lại cuốn CTDL&GT (978-2) -> Phải THÀNH CÔNG:");
        tv.muonSach("DG002", "978-2");
    }
}
