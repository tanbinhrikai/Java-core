package day5.demoproxy;

import java.util.HashMap;
import java.util.Map;

public class RateLimitingProxy {
    private RealService realService;

    // "Cuốn sổ tay" đếm số lượng request của từng user
    private Map<String, Integer> boDemRequest;

    // Cấu hình giới hạn
    private final int GIOI_HAN_FREE = 3;
    private final int GIOI_HAN_PREMIUM = 10;

    public RateLimitingProxy() {
        this.realService = new RealService();
        this.boDemRequest = new HashMap<>();
    }

    public void timSach(String isbn, NguoiDung user) {
        String username = user.getTenDangNhap();

        // 1. Lấy số lần đã gọi hiện tại của user này (nếu chưa có thì mặc định là 0)
        int soLanDaGoi = boDemRequest.getOrDefault(username, 0);

        // 2. Xác định hạn mức dựa vào loại tài khoản
        int hanMuc = user.isPremium() ? GIOI_HAN_PREMIUM : GIOI_HAN_FREE;

        System.out.print("[PROXY] User '" + username + "' (Đã gọi " + soLanDaGoi + "/" + hanMuc + ") -> ");

        // 3. Kiểm tra xem có bị vượt quá giới hạn không?
        if (soLanDaGoi >= hanMuc) {
            System.out.println("❌ LỖI: BẠN ĐÃ HẾT LƯỢT! Vui lòng nâng cấp gói Premium.");
            return; // Đuổi về luôn, không gọi hàm bên dưới
        }

        // 4. Nếu hợp lệ: Tăng bộ đếm lên 1 và cho phép đi qua
        boDemRequest.put(username, soLanDaGoi + 1);
        System.out.println("✅ OK, Cho phép truy cập.");
        realService.timSach(isbn);
    }

}
