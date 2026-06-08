package bai4;

public class Book {

    private String title;
    private String author;
    private String publisher;
    private int year;
    private String isbn;
    private int pages;
    private double price;

    private Book(Builder builder) {
        this.title = builder.title;
        this.author = builder.author;
        this.publisher = builder.publisher;
        this.year = builder.year;
        this.isbn = builder.isbn;
        this.pages = builder.pages;
        this.price = builder.price;
    }

    public static class Builder {

        private String title;
        private String author;
        private String publisher;
        private int year;
        private String isbn;
        private int pages;
        private double price;

        public Builder(String title) {
            this.title = title;
        }

        public Builder author(String author) {
            this.author = author;
            return this;
        }

        public Builder publisher(String publisher) {
            this.publisher = publisher;
            return this;
        }

        public Builder year(int year) {
            this.year = year;
            return this;
        }

        public Builder isbn(String isbn) {
            this.isbn = isbn;
            return this;
        }

        public Builder pages(int pages) {
            this.pages = pages;
            return this;
        }

        public Builder price(double price) {
            this.price = price;
            return this;
        }

        public Book build() {
            return new Book(this);
        }
    }


}