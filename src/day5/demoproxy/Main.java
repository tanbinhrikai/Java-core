package day5.demoproxy;

public class Main {
    public static void main(String[] args) {
        RateLimitingProxy proxy = new RateLimitingProxy();

        NguoiDung teoFree = new NguoiDung("Teo", false); // Tài khoản Free

        System.out.println("--- Tèo cày API liên tục ---");
        proxy.timSach("978-111", teoFree); // Lần 1
        proxy.timSach("978-222", teoFree); // Lần 2
        proxy.timSach("978-333", teoFree); // Lần 3

        // Cú click thứ 4 của Tèo sẽ bị Proxy khóa mõm ngay lập tức
        proxy.timSach("978-444", teoFree); // Lần 4 (Thất bại)

        System.out.println("\n--- Đại gia Tí (Premium) vào cuộc ---");
        NguoiDung tiPremium = new NguoiDung("Ti_VIP", true);
        proxy.timSach("978-555", tiPremium); // Lần 1 của Tí vẫn đi lọt bình thường
        proxy.timSach("978-555", tiPremium); // Lần 1 của Tí vẫn đi lọt bình thường
        proxy.timSach("978-555", tiPremium); // Lần 1 của Tí vẫn đi lọt bình thường
        proxy.timSach("978-555", tiPremium); // Lần 1 của Tí vẫn đi lọt bình thường
        proxy.timSach("978-555", tiPremium); // Lần 1 của Tí vẫn đi lọt bình thường
        proxy.timSach("978-555", tiPremium); // Lần 1 của Tí vẫn đi lọt bình thường

    }
}
