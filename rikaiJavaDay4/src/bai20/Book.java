package bai20;

class Book {
    String isbn;
    String title;
    String author;
    int totalQuantity;
    int borrowedCount;

    public Book(String isbn, String title, String author, int totalQuantity) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
        this.totalQuantity = totalQuantity;
        this.borrowedCount = 0;
    }

    public boolean available() {
        return borrowedCount < totalQuantity;
    }

    public void borrow() {
        borrowedCount++;
    }

    public void returnBook() {
        borrowedCount--;
    }

    @Override
    public String toString() {
        return isbn + " - " + title + " (" + author + ") [" +
                borrowedCount + "/" + totalQuantity + "]";
    }
}
