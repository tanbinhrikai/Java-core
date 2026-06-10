package day6.bai13;

public class ExceptionChainingDemo {

    // ==========================================
    // 1. TẠO HỆ THỐNG PHÂN LỚP EXCEPTION
    // ==========================================

    // DatabaseException là Checked Exception (bắt buộc phải try-catch hoặc throws)
    static class DatabaseException extends Exception {
        public DatabaseException(String message) {
            super(message);
        }

        // Constructor quan trọng nhất cho Exception Chaining
        public DatabaseException(String message, Throwable cause) {
            super(message, cause);
        }
    }

    // UserNotFoundException kế thừa DatabaseException
    static class UserNotFoundException extends DatabaseException {
        public UserNotFoundException(String message) {
            super(message);
        }
    }

    // ValidationException là Unchecked Exception (RuntimeException)
    static class ValidationException extends RuntimeException {
        public ValidationException(String message) {
            super(message);
        }
    }

    // ==========================================
    // 2. LỚP NGHIỆP VỤ (SERVICE)
    // ==========================================

    static class UserService {
        // Hàm này có thể ném ra Unchecked Exception (Validation) hoặc Checked Exception (UserNotFound)
        public void timUser(int id) throws UserNotFoundException {
            if (id == 0) {
                // Ví dụ ném RuntimeException, không bắt buộc phải khai báo throws
                throw new ValidationException("ID không được bằng 0");
            }
            if (id < 0) {
                // Ném ngoại lệ gốc khi không tìm thấy user
                throw new UserNotFoundException("Không tìm thấy user với ID: " + id);
            }
            System.out.println("Tìm thấy user: " + id);
        }
    }

    // ==========================================
    // 3. CHƯƠNG TRÌNH CHÍNH (TESTING)
    // ==========================================

    public static void main(String[] args) {
        UserService userService = new UserService();

        try {
            // Khối try này đại diện cho tầng Service gọi xuống Repository
            try {
                userService.timUser(-1);

            } catch (UserNotFoundException e) {
                // Tầng này bắt ngoại lệ chi tiết, log lại và ném ra ngoại lệ tổng quát hơn
                System.out.println("[LOG TẦNG SERVICE] Bắt được UserNotFoundException. Đang đóng gói lại...");

                // EXCEPTION CHAINING: Truyền 'e' vào làm nguyên nhân (cause) cho DatabaseException
                throw new DatabaseException("DB error: User not found", e);
            }

        } catch (DatabaseException e) {
            // Khối catch này đại diện cho tầng cao nhất (như Controller hoặc UI)
            System.out.println("\n=== XỬ LÝ Ở TẦNG CAO NHẤT ===");

            // Lấy ra message của Exception hiện tại
            System.out.println("Message: " + e.getMessage());

            // Lấy ra ngoại lệ gốc bằng getCause()
            System.out.println("Cause: " + e.getCause());

            System.out.println("\n=== STACK TRACE ĐẦY ĐỦ ===");
            // In ra toàn bộ dấu vết hệ thống. Cờ 'System.out' giúp in màu trắng đồng bộ với log thông thường
            e.printStackTrace(System.out);
        }
    }
}