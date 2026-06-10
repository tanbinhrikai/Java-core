package day6.bai18;

public class Main {
    public static void infiniteMethod() {
        infiniteMethod();
    }

    public static void main(String[] args) {
        System.out.println("Bắt đầu chạy đệ quy vô tận...");
//        infiniteMethod(); // Sẽ ném ra StackOverflowError và dừng chương trình

        System.out.println("Chuẩn bị tạo mảng dung lượng siêu lớn...");
        // Cố gắng cấp phát mảng số nguyên có kích thước tối đa của Java
//        int[] largeArray = new int[Integer.MAX_VALUE];

        try {
            // Gọi lại hàm gây lỗi StackOverflow ở phần 1
            infiniteMethod();
        } catch (StackOverflowError e) {
            System.err.println("⚠️ Đã catch được một Error: " + e.getMessage());
            System.err.println("Thực tế KHÔNG NÊN catch Error vì hệ thống lúc này đã không còn ổn định.");
        }
    }
}
