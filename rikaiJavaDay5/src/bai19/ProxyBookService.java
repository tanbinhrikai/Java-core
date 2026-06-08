package bai19;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class ProxyBookService implements BookService {

    private final BookService realService;
    private final Map<String, Book> cache = new HashMap<>();
    private final boolean hasAccess;

    public ProxyBookService(BookService realService, boolean hasAccess) {
        this.realService = realService;
        this.hasAccess = hasAccess;
    }

    @Override
    public Book findByISBN(String isbn) {

        System.out.println("[LOG] Request: findByISBN " + isbn);

        if (!hasAccess) {
            System.out.println("[DENIED] No permission");
            return null;
        }

        if (cache.containsKey(isbn)) {
            System.out.println("[CACHE] Hit -> return instantly (0ms)");
            return cache.get(isbn);
        }

        System.out.println("[CACHE] Miss -> calling RealService (200ms)");

        Book book = realService.findByISBN(isbn);

        cache.put(isbn, book);

        System.out.println("[LOG] Response: " + book);

        return book;
    }

    @Override
    public List<Book> findByAuthor(String author) {

        System.out.println("[LOG] Request: findByAuthor " + author);

        if (!hasAccess) {
            System.out.println("[DENIED] No permission");
            return Collections.emptyList();
        }

        return realService.findByAuthor(author);
    }
}
