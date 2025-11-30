package ticket.booking.entities;

import java.util.List;

public class User {

    private String userId;
    private String name;
    private String hashedPassword;
    private List<Ticket> ticketsBooked;
    private String password;

    //Default Constructor
    public User(){}

    //Paramaterized Constructor
    public User(String userId, String name, String hashedPassword, List<Ticket> ticketsBooked, String password){
        this.userId = userId;
        this.name = name;
        this.hashedPassword = hashedPassword;
        this.ticketsBooked = ticketsBooked;
        this.password = password;
    }

    //Getters
    public String getUserId(){
        return this.userId;
    }

    public String getName(){
        return this.name;
    }

    public String getPassword(){
        return this.password;
    }

    public String getHashedPassword(){
        return this.hashedPassword;
    }

    public List<Ticket> getTickets(){
        return this.ticketsBooked;
    }

    public void printTickets(){
        for(int i=0; i<this.ticketsBooked.size(); i++){
            System.out.println(ticketsBooked.get(i).getTicketInfo());
        }
    }


    //Setters
    public void setUserId(String userId){
        this.userId = userId;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setPassword(String password){
        this.password = password;
    }

    public void setHashedPassword(String hashedPassword){
        this.hashedPassword = hashedPassword;
    }

    public void setTicketsBooked(List<Ticket> ticketsBooked){
        this.ticketsBooked = ticketsBooked;
    }

}
