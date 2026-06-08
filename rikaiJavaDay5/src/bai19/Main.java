package bai19;

public class Main {
    public static void main(String[] args) {

        BookService realService = new RealBookService();

        BookService proxy = new ProxyBookService(realService, true);

        System.out.println("\n FIRST CALL ");
        proxy.findByISBN("978-001");

        System.out.println("\n SECOND CALL ");
        proxy.findByISBN("978-001");

        System.out.println("\n SEARCH");
        System.out.println(proxy.findByAuthor("java"));
    }
}
