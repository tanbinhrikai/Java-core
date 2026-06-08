package bai19;

import java.util.List;

interface BookService {
    Book findByISBN(String isbn);
    List<Book> findByAuthor(String author);
}
