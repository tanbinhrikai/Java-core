package bai13;

public class Main {

    public static void main(String[] args) {

        UserService userService = new UserService();
        try {
            try {
                userService.findUser(-1);

            } catch (UserNotFoundException e) {

                System.out.println("LOG: " + e.getMessage());

                throw new DatabaseException(
                        "error: user service fail",
                        e
                );
            }

        } catch (DatabaseException e) {

            System.out.println("LOG: " + e.getMessage());

            System.out.println(
                    "CAUSE: " + e.getCause()
            );

            e.printStackTrace();
        }
    }
}