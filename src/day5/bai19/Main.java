package day5.bai19;

public class Main {
    public static void main(String[] args) {
        ProxyService proxy = new ProxyService(false);
        proxy.timTheoISBN("978-001");


        ProxyService proxy2 = new ProxyService(true);
        System.out.println();
        proxy2.timTheoISBN("978-001");

    }
}
