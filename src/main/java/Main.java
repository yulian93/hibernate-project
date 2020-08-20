import models.Auto;
import models.User;
import services.UserService;

import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException {

        UserService userService = new UserService();

        for (User user : userService.findAllUsers()){
            System.out.println(user);
        }




    }
}