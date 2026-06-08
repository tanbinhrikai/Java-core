package bai20;

import java.util.ArrayList;
import java.util.List;

class Member {
    String memberId;
    String name;
    String email;
    List<Book> borrowedBooks = new ArrayList<>();

    public Member(String memberId, String name, String email) {
        this.memberId = memberId;
        this.name = name;
        this.email = email;
    }

    public void borrowBook(Book book) {
        borrowedBooks.add(book);
    }

    public void returnBook(Book book) {
        borrowedBooks.remove(book);
    }

    @Override
    public String toString() {
        return memberId + " - " + name;
    }
}
