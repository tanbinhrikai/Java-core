package day7.bai13;

import java.util.concurrent.CompletableFuture;

public class Main {
    public static void sleep(int milliseconds) {
        try {
            Thread.sleep(milliseconds);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    // 2. Mô phỏng API lấy thông tin User
    public static String fetchUser(String userId) {
        System.out.println("Đang tìm User trên luồng: " + Thread.currentThread().getName());
        sleep(5000); // Giả lập mạng chậm mất 2 giây

        // Giả lập lỗi nếu userId là null
        if (userId == null) throw new RuntimeException("Không tìm thấy User!");
        return "Nguyen An";
    }

    // 3. Mô phỏng API lấy điểm số
    public static int fetchScore(String userId) {
        System.out.println("Đang lấy Điểm số trên luồng: " + Thread.currentThread().getName());
        sleep(3000); // Giả lập mạng chậm mất 3 giây
        return 100;
    }

    public static void main(String[] args) {
        System.out.println("--- BẮT ĐẦU CHƯƠNG TRÌNH ---");
        long startTime = System.currentTimeMillis();

        // Bước 1: Gọi async lấy User (chạy background)
        CompletableFuture<String> userFuture = CompletableFuture
                .supplyAsync(() -> fetchUser("SV001"))
                // Bước 2: Dùng thenApply biến tên thành in hoa
                .thenApply(String::toUpperCase);

        // Bước 3: Gọi async lấy Điểm số (chạy song song với lấy User)
        CompletableFuture<Integer> scoreFuture = CompletableFuture
                .supplyAsync(() -> fetchScore("SV001"));

        // Bước 4: Dùng thenCombine gộp kết quả của userFuture và scoreFuture
        CompletableFuture<Void> finalResult = userFuture
                .thenCombine(scoreFuture, (user, score) -> {
                    return "Sinh viên: " + user + " | Điểm: " + score;
                })
                // Bước 5: Dùng exceptionally để bắt lỗi nếu có
                .exceptionally(ex -> {
                    return "Đã xảy ra lỗi: " + ex.getMessage();
                })
                // Bước 6: Dùng thenAccept để in kết quả ra (consume)
                .thenAccept(result -> {
                    System.out.println("KẾT QUẢ CUỐI CÙNG: " + result);
                });

        System.out.println("Main thread vẫn đang làm việc khác trong lúc chờ API...");
        finalResult.join();

        long endTime = System.currentTimeMillis();
        System.out.println("Tổng thời gian chạy: " + (endTime - startTime) / 1000 + " giây.");
        System.out.println("--- KẾT THÚC ---");
    }
}