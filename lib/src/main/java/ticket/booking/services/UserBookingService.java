package ticket.booking.services;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import ticket.booking.entities.User;

import java.io.File;
import java.io.IOException;
import java.util.List;

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
}
