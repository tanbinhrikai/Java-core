package day6.bai18;

import java.util.Optional;

public class BestPracticeDemo {
    // NÊN DÙNG OPTIONAL: Việc không tìm thấy User bằng ID là chuyện bình thường trong logic
    public static Optional<String> findUserById(int id) {
        if (id == 1) {
            return Optional.of("Trần Văn A");
        }
        return Optional.empty(); // Trả về "trống rỗng", không gây crash app
    }

    // NÊN THROW EXCEPTION: Truy cập trái phép là hành vi bất thường, vi phạm quy tắc bảo mật
    public static void accessSystem(boolean isAdmin) throws IllegalAccessException {
        if (!isAdmin) {
            throw new IllegalAccessException("Lỗi bảo mật: Bạn không có quyền truy cập!");
        }
        System.out.println("Truy cập thành công.");
    }

    public static void main(String[] args) {
        // Sử dụng Optional gọn gàng, tránh NullPointerException
        Optional<String> user = findUserById(99);
        String name = user.orElse("User ẩn danh");
        System.out.println("Kết quả tìm kiếm: " + name);

        // Sử dụng Exception cho trường hợp nghiêm trọng
        try {
            accessSystem(false);
        } catch (IllegalAccessException e) {
            System.out.println("Xử lý vi phạm: " + e.getMessage());
        }
    }
}
