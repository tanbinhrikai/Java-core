package day5.bai19;

import java.util.Arrays;
import java.util.List;

public class RealService implements DichVuSach {

    DichVuSach dichVuSach;

    // Giả lập Database
    private List<Sach> database = Arrays.asList(
            new Sach("978-001", "Java Core", "Nguyen Van A"),
            new Sach("978-002", "Spring Boot Thực Chiến", "Nguyen Van A"),
            new Sach("978-003", "Design Patterns", "Tran Van B"));

    @Override
    public Sach timTheoISBN(String isbn) {
        try {
            String[] spinner = {"|", "/", "-", "\\"};

            for (int i = 0; i < 20; i++) { // Lặp 20 lần
                System.out.print("\rĐang tìm sách trong kho... " + spinner[i % 4]);
                Thread.sleep(150);
            }
            System.out.println("\rĐã tìm xong!                    "); // Xóa dòng loading cũ

            for (Sach s : database) {
                if (s.getIsbn().equals(isbn)) return s; // Đơn giản hóa việc tìm kiếm
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        return null;
    }

    @Override
    public List<Sach> timTheoTenTacGia(String ta) {
        return List.of();
    }
}
