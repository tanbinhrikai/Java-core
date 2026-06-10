package day6.bai10;

import java.util.*;

public class DanhBaDienThoai {
    // Sử dụng TreeMap để tự động sắp xếp tên (Key) theo bảng chữ cái A-Z
    private TreeMap<String, List<String>> danhBa;

    public DanhBaDienThoai() {
        danhBa = new TreeMap<>();
    }

    // 1. Thêm liên lạc (Một tên có thể có nhiều số)
    public void addContact(String ten, String soDT) {
        // computeIfAbsent: Nếu tên chưa có trong map, tạo một danh sách mới. Sau đó thêm số.
        danhBa.computeIfAbsent(ten, k -> new ArrayList<>()).add(soDT);
        System.out.println("Đã thêm: " + ten + " - " + soDT);
    }

    // 2. Tìm kiếm: Tìm tất cả số của một tên
    public void searchByName(String ten) {
        List<String> dsSo = danhBa.get(ten);
        if (dsSo != null && !dsSo.isEmpty()) {
            System.out.println(ten + ": " + dsSo);
        } else {
            System.out.println("Không tìm thấy liên lạc: " + ten);
        }
    }

    // 3. Duyệt: In danh bạ theo alphabet
    public void printAll() {
        System.out.println("--- Danh Bạ (Sorted A-Z) ---");
        if (danhBa.isEmpty()) {
            System.out.println("Danh bạ trống.");
            return;
        }
        for (Map.Entry<String, List<String>> entry : danhBa.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
        System.out.println("----------------------------");
    }

    // 4. Tìm theo tiền tố (VD: Bắt đầu bằng "A")
    public void searchByPrefix(String prefix) {
        System.out.println("--- Tìm kiếm theo tiền tố '" + prefix + "' ---");

        // Tạo key giới hạn trên bằng cách tăng ký tự cuối cùng của chuỗi prefix lên 1 đơn vị
        // Ví dụ: prefix = "A" -> limitKey = "B"
        // prefix = "An" -> limitKey = "Ao"
        String limitKey = prefix.substring(0, prefix.length() - 1) +
                (char) (prefix.charAt(prefix.length() - 1) + 1);

        // subMap(fromKey, toKey): Lấy từ fromKey (bao gồm) đến toKey (không bao gồm)
        SortedMap<String, List<String>> ketQua = danhBa.subMap(prefix, limitKey);

        if (ketQua.isEmpty()) {
            System.out.println("Không có liên lạc nào bắt đầu bằng '" + prefix + "'");
        } else {
            for (Map.Entry<String, List<String>> entry : ketQua.entrySet()) {
                System.out.println(entry.getKey() + ": " + entry.getValue());
            }
        }
    }

    // 5. Xóa số điện thoại cụ thể
    public void deletePhone(String ten, String soDT) {
        List<String> dsSo = danhBa.get(ten);
        if (dsSo != null) {
            if (dsSo.remove(soDT)) {
                System.out.println("Đã xóa số " + soDT + " của " + ten);
                // Nếu sau khi xóa mà danh sách trống thì xóa luôn tên khỏi danh bạ
                if (dsSo.isEmpty()) {
                    danhBa.remove(ten);
                }
            } else {
                System.out.println("Không tìm thấy số " + soDT + " trong liên lạc của " + ten);
            }
        } else {
            System.out.println("Không tìm thấy liên lạc: " + ten);
        }
    }

    // Hàm Main để chạy thử nghiệm các tính năng
    public static void main(String[] args) {
        DanhBaDienThoai db = new DanhBaDienThoai();

        System.out.println("=== THÊM LIÊN LẠC ===");
        db.addContact("Chi", "0904");
        db.addContact("An", "0901");
        db.addContact("Bao", "0903");
        db.addContact("An", "0902");
        db.addContact("Chi", "0905");

        System.out.println("\n=== IN DANH BẠ ===");
        db.printAll(); // Kỳ vọng tự động sắp xếp: An, Bao, Chi

        System.out.println("\n=== TÌM KIẾM TÊN ===");
        db.searchByName("An");

        System.out.println("\n=== TÌM THEO TIỀN TỐ ===");
        db.searchByPrefix("A"); // Sẽ in ra An
        db.searchByPrefix("C"); // Sẽ in ra Chi

        System.out.println("\n=== XÓA SỐ CỤ THỂ ===");
        db.deletePhone("Chi", "0904");
        System.out.println("Sau khi xóa:");
        db.searchByName("Chi"); // Kỳ vọng chỉ còn [0905]
    }
}