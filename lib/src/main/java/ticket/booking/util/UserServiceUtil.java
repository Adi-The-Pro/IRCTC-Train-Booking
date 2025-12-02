package ticket.booking.util;

import  org.mindrot.jbcrypt.BCrypt;

public class UserServiceUtil {

    //Create a hash password from plain password
    public static String hashPassword(String plainPassword){
        return BCrypt.hashpw(plainPassword, BCrypt.gensalt());
    }

    //Check weather the plain password and hashed-password are same or not
    public static boolean checkPassword(String plainPassword, String hashedPassword){
        return BCrypt.checkpw(plainPassword,hashedPassword);
    }

}
