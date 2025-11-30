package ticket.booking.entities;

import java.sql.Time;
import java.util.List;
import java.util.Map;

public class Train {
    private String trainId;
    private String trainNo;
    private List<List<Integer>> seats;
    private Map<String, String> stationTime;
    private List<String> stations;

    //Default Constructor
    public Train(){}

    //Parameterized Constructor
    public Train(String trainId, String trainNo, List<List<Integer>> seats, Map<String,String> stationTime, List<String> stations){
        this.trainId = trainId;
        this.trainId = trainId;
        this.seats = seats;
        this.stationTime = stationTime;
        this.stations = stations;
    }

    //Getters
    public String getTrainId(){
        return this.trainId;
    }

    public String getTrainNo(){
        return this.trainNo;
    }

    public List<List<Integer>> getSeats(){
        return this.seats;
    }

    public Map<String,String>  getStationTime(){
        return this.stationTime;
    }

    public List<String> getStations(){
        return this.stations;
    }

    //Setters
    public void setTrainId(String trainId){
        this.trainId = trainId;
    }

    public void setTrainNo(String trainNo){
        this.trainNo = trainNo;
    }

    public void setSeats(List<List<Integer>> seats){
        this.seats = seats;
    }

    public void setStationTime(Map<String,String> stationTime){
        this.stationTime = stationTime;
    }

    public void setStations(List<String> stations){
        this.stations = stations;
    }

    public String getTrainInfo(){
        return String.format("Train ID: %s, Train No: %s", trainId, trainNo);
    }
}
