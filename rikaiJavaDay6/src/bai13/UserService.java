package bai13;

public class UserService {
    public void TimUser(int number) throws UserNotFoundException {
        throw  new UserNotFoundException("user not found");
    }
}
