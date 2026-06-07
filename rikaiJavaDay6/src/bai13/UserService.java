package bai13;

public class UserService {

    public void findUser(int id) throws UserNotFoundException {
        if (id < 0) {
            throw new UserNotFoundException("User not found");
        }
    }
}