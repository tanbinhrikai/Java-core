package day7.bai18;

import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.stream.*;

public class ParallelStreamDemo {
    public static void main(String[] args) {
        System.out.println("=== 1. SO SÁNH TỐC ĐỘ: SEQUENTIAL vs PARALLEL ===");
        comparePerformance();

        System.out.println("\n=== 2. VẤN ĐỀ RACE CONDITION ===");
        demonstrateRaceCondition();

        System.out.println("\n=== 3. CÁCH KHẮC PHỤC: THREAD-SAFE COLLECTORS ===");
        threadSafeCollectors();
    }

    // 2. Tính tổng: So sánh thời gian
    public static void comparePerformance() {
        // Tăng số lượng lên 1 tỷ để thấy rõ sự khác biệt của Multi-core CPU
        long n = 1_000_000_000L;

        // --- TÍNH TUẦN TỰ (Sequential) ---
        long startSeq = System.currentTimeMillis();
        long sumSeq = LongStream.rangeClosed(1, n).sum();
        long endSeq = System.currentTimeMillis();
        System.out.println("Sequential Sum: " + sumSeq + " | Thời gian: " + (endSeq - startSeq) + "ms");

        // --- TÍNH SONG SONG (Parallel) ---
        long startPar = System.currentTimeMillis();
        long sumPar = LongStream.rangeClosed(1, n).parallel().sum();
        long endPar = System.currentTimeMillis();
        System.out.println("Parallel Sum  : " + sumPar + " | Thời gian: " + (endPar - startPar) + "ms");
    }

    // 3. Vấn đề Race Condition
    public static void demonstrateRaceCondition() {
        List<Integer> unsafeList = new ArrayList<>();

        // Dùng parallel stream thao tác trên một cấu trúc dữ liệu không an toàn (ArrayList)
        IntStream.rangeClosed(1, 1000).parallel().forEach(i -> unsafeList.add(i));

        // Kết quả thường sẽ < 1000 do nhiều thread cùng ghi đè vào 1 vị trí index,
        // hoặc thậm chí ném ra lỗi ArrayIndexOutOfBoundsException.
        System.out.println("Kích thước unsafeList (Kỳ vọng 1000): " + unsafeList.size() + " -> LỖI RACE CONDITION!");
    }

    // 4. Thread-safe Collectors
    public static void threadSafeCollectors() {
        // Cách 1: Sử dụng cấu trúc dữ liệu Thread-safe (ví dụ: CopyOnWriteArrayList)
        List<Integer> safeList1 = new CopyOnWriteArrayList<>();
        IntStream.rangeClosed(1, 1000).parallel().forEach(i -> safeList1.add(i));
        System.out.println("Dùng CopyOnWriteArrayList: " + safeList1.size() + " phần tử -> AN TOÀN");

        // Cách 2 (Khuyên dùng): Thay vì dùng forEach để gom data, hãy dùng collect()
        // Hàm collect() của Stream API được thiết kế để tự động xử lý việc gom kết quả
        // từ nhiều thread một cách an toàn và tối ưu nhất.
        List<Integer> safeList2 = IntStream.rangeClosed(1, 1000)
                .parallel()
                .boxed() // Ép kiểu từ int nguyên thủy sang Integer object
                .collect(Collectors.toList());
        System.out.println("Dùng Collectors.toList(): " + safeList2.size() + " phần tử -> AN TOÀN TUYỆT ĐỐI");
    }
}