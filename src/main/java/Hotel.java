import java.util.*;

public class Hotel {
    private String name;
    private ArrayList<SingleRoom> singleRooms;
    private ArrayList<DoubleRoom> doubleRooms;
    private ArrayList<ConferenceRoom> conferenceRooms;

    public Hotel(String name, ArrayList<SingleRoom> singleRooms, ArrayList<DoubleRoom> doubleRooms, ArrayList<ConferenceRoom> conferenceRooms) {
        this.name = name;
        this.singleRooms = singleRooms;
        this.doubleRooms = doubleRooms;
        this.conferenceRooms = conferenceRooms;
    }

    public String getName() {
        return name;
    }

    public int getRoomCount() {
        return singleRooms.size() + doubleRooms.size() + conferenceRooms.size();
    }

//    private boolean roomIsFull(ArrayList roomType){
//
//    }
//
//    public Object checkInGuest(Guest guest, String room) {
//
//    }
}
