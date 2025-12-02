package ticket.booking.services;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import ticket.booking.entities.User;
import ticket.booking.util.UserServiceUtil;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Optional;

public class UserBookingService {

    private User user;

    //For serializing and de-serializing
    private ObjectMapper objectMapper = new ObjectMapper();

    //We made this final so that this can't be changed ever, as static so that this is available
    // in the memory to be used whenever we want
    private static final String USERS_PATH = "lib/src/main/java/ticket/booking/localdb/users.json";

    private List<User> userList;

    public UserBookingService(User user1) throws IOException {
        this.user = user1;
        File users = new File(USERS_PATH);

        //converts "user_id" (database)  => userId (Entity)
        userList = objectMapper.readValue(users,new TypeReference<List<User>>() {});
    }

    public Boolean loginUser(){
        Optional<User> foundUser = userList.stream().filter(user1 -> {
            return user1.getName().equals(user.getName()) && UserServiceUtil.checkPassword(user.getPassword(),user1.getHashedPassword());
        }).findFirst();
        return foundUser.isPresent();
    }

    public Boolean signUp(User user1){
        try{
            userList.add(user1);
            saveUserListToFile();
            return Boolean.TRUE;
        }
        catch(IOException ex){
            return Boolean.FALSE;
        }
    }

    //Saving the userList to the LocalDb
    private void saveUserListToFile() throws IOException{
        File usersFile = new File(USERS_PATH);
        objectMapper.writeValue(usersFile,userList);
    }
}
