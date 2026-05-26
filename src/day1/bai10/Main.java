package day1.bai10;

public class Main {
    static void main() {
        String s1 = "Java";
        String s2 = "Java";
        String s3 = new String("Java");
        System.out.printf("s1 == s2 -> %b so sanh gia tri %n", s1 == s2);
        System.out.printf("s1 == s3 -> %b so sanh dia chi, s1.equals(s3) -> %b so sanh gia tri %n", s1 == s3, s1.equals(s3));
        String s4 = s3.intern();
        System.out.printf("s1 == s4 -> %b String.intern() trả về tham chiếu từ pool", s1 == s4);
    }
}
