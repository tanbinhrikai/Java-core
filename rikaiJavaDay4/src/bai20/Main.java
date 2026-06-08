package bai20;

public class Main {
    public static void main(String[] args) {

        Library library = new Library();

        library.addBook(new Book("ISBN-001", "Java Core", "Author A", 2));
        library.addBook(new Book("ISBN-002", "Spring Boot", "Author B", 1));

        library.addMember(new Member("M001", "Alex", "alex@gmail.com"));
        library.addMember(new Member("M002", "Bob", "bob@gmail.com"));

        System.out.println(" LIBRARY ");

        library.borrowBook("M001", "ISBN-001");
        library.borrowBook("M002", "ISBN-001");
        library.borrowBook("M002", "ISBN-001");

        library.returnBook("M001", "ISBN-001");

        System.out.println("\nSearch 'Java':");
        System.out.println(library.search("Java"));

        System.out.println();
        library.printAll();
    }
}
