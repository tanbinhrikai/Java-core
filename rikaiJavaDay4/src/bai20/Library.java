package bai20;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Library {

    private Map<String, Book> bookMap = new HashMap<>();
    private Map<String, Member> memberMap = new HashMap<>();

    public void addBook(Book book) {
        bookMap.put(book.isbn, book);
    }

    public void addMember(Member member) {
        memberMap.put(member.memberId, member);
    }

    public void borrowBook(String memberId, String isbn) {

        Member member = memberMap.get(memberId);
        Book book = bookMap.get(isbn);

        if (member == null || book == null) {
            System.out.println("Member or Book not found!");
            return;
        }

        if (!book.available()) {
            System.out.println("OUT OF STOCK!");
            return;
        }

        book.borrow();
        member.borrowBook(book);

        System.out.println("borrowBook(" + memberId + ", " + isbn + ") -> OK. Remaining: " +
                (book.totalQuantity - book.borrowedCount));
    }

    public void returnBook(String memberId, String isbn) {

        Member member = memberMap.get(memberId);
        Book book = bookMap.get(isbn);

        if (member == null || book == null) return;

        book.returnBook();
        member.returnBook(book);

        System.out.println("returnBook(" + memberId + ", " + isbn + ") -> OK. Remaining: " +
                (book.totalQuantity - book.borrowedCount));
    }

    public List<Book> search(String keyword) {
        List<Book> result = new ArrayList<>();

        for (Book b : bookMap.values()) {
            if (b.title.toLowerCase().contains(keyword.toLowerCase())
                    || b.author.toLowerCase().contains(keyword.toLowerCase())) {
                result.add(b);
            }
        }

        return result;
    }

    public void printAll() {

        System.out.println(" BOOKS ");
        for (Book b : bookMap.values()) {
            System.out.println(b);
        }

        System.out.println("\n  MEMBERS ");
        for (Member m : memberMap.values()) {
            System.out.println(m + " | borrowed: " + m.borrowedBooks.size());
        }
    }
}