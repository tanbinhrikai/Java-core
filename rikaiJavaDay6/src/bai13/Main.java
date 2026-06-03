package bai13;

public class Main {
    public static void main(String[] args)  {
        UserService userService = new UserService();
        try {
            try {
                userService.TimUser(-1);
            } catch (UserNotFoundException userNotFoundException) {
                System.out.println(userNotFoundException.getMessage());
                throw new DatabaseException("database exception");
            }
        }catch (DatabaseException databaseException) {
            System.out.println(databaseException.getMessage());
        }
    }
}
