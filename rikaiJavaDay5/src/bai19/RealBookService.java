package bai19;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class RealBookService implements BookService {

    private final Map<String, Book> db = new HashMap<>();

    public RealBookService() {
        db.put("978-001", new Book("978-001", "Java Core"));
        db.put("978-002", new Book("978-002", "Spring Boot"));
        db.put("978-003", new Book("978-003", "Microservices"));
    }

    @Override
    public Book findByISBN(String isbn) {
        simulateSlowDB();
        return db.get(isbn);
    }

    @Override
    public List<Book> findByAuthor(String author) {
        simulateSlowDB();
        List<Book> result = new ArrayList<>();

        for (Book b : db.values()) {
            if (b.title.toLowerCase().contains(author.toLowerCase())) {
                result.add(b);
            }
        }
        return result;
    }

    private void simulateSlowDB() {
        try {
            Thread.sleep(200);
        } catch (InterruptedException ignored) {}
    }
}
