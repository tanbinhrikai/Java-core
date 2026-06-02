package bai13;

public class UserNotFoundException extends DatabaseException{
    public UserNotFoundException(String message) {
        super(message);
    }
}
