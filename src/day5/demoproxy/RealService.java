package day5.demoproxy;

public class RealService {
    public void timSach(String isbn) {
        System.out.println("   [DATABASE] Đang lấy dữ liệu sách " + isbn + " từ DB...");
    }
}
