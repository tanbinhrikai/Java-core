package day6.bai13;

public class DatabaseException extends Exception {
    public DatabaseException(String message) {
        super(message);
    }
    // Constructor quan trọng phục vụ Exception Chaining
    public DatabaseException(String message, Throwable cause) {
        super(message, cause);
    }
}
