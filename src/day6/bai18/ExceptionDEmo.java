package day6.bai18;

import java.io.FileReader;
import java.io.IOException;

public class ExceptionDEmo {

    // 1. Checked Exception: Compiler BẮT BUỘC phải xử lý bằng 'throws' hoặc 'try-catch'
    public static void readFile() throws IOException {
        FileReader reader = new FileReader("file_khong_ton_tai.txt");
    }

    // 2. Unchecked Exception: Thừa kế từ RuntimeException, compiler không ép xử lý
    public static void parseStringToInt(String input) {
        // Nếu input là "abc", hàm này sẽ ném ra NumberFormatException (Unchecked)
        int number = Integer.parseInt(input);
        System.out.println("Số đã parse: " + number);
    }

    public static void main(String[] args) {
        // Thử nghiệm Unchecked
        try {
            parseStringToInt("không phải số");
        } catch (NumberFormatException e) {
            System.out.println("Catch Unchecked Exception thành công: " + e.getMessage());
        }

        // Thử nghiệm Checked
        try {
            readFile();
        } catch (IOException e) {
            System.out.println("Catch Checked Exception thành công: " + e.getMessage());
        }
    }
}
