package day7.bai17;

public class Main {

    public static void quickCheck(Object obj) {
        if (obj instanceof TextMsg(String content, User(String name, int age))) {
            System.out.println(content + " " + name + age);
        }
    }

    public static void processMessage(Message msg) {
        switch (msg) {
            case TextMsg(String content, User(String name, int age)) when age >= 18 -> {
                System.out.println("[TEXT] " + name + " (Adult) gửi: " + content);
            }

            case TextMsg(String content, User(String name, int age)) -> {
                System.out.println("[TEXT] - RESTRICTED " + name + " Underage send message");
            }

            case ImageMsg(byte[] data, String caption) when caption == null || caption.isBlank() -> {
                System.out.println("[IMAGE] nhan dc anh (" + data.length + ") bytes khong co chu de");
            }

            case ImageMsg(byte[] data, String caption) ->
                    System.out.println("[IMAGE] nhan duoc anh. CHu thich: " + caption);

            case VideoMsg(String url, int duration) when duration > 60 -> {
                System.out.println("[VIDEO -LONG ] DAI: " + duration + " tai url: " + url);
            }
            case VideoMsg(String url, int duration) -> {
                System.out.println("[Video - Short] Video ngắn tại: " + url);
            }
        }
    }

    public static void main(String[] args) {
        User adult = new User("Alice", 25);
        User kid = new User("Bob", 12);

        Message msg1 = new TextMsg("Xin chào thế giới!", adult);
        Message msg2 = new TextMsg("Mình muốn mua kẹo", kid);
        Message msg3 = new ImageMsg(new byte[]{0, 1, 0, 1}, "Ảnh chụp bãi biển");
        Message msg4 = new VideoMsg("https://youtube.com/short_video", 15);

        System.out.println("--- Bắt đầu xử lý tin nhắn ---");
        processMessage(msg1);
        processMessage(msg2);
        processMessage(msg3);
        processMessage(msg4);

        System.out.println("\n--- Test Instanceof Pattern ---");
        quickCheck(msg1);
    }
}
