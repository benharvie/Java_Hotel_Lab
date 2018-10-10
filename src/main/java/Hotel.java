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

    public void checkGuestInSingleRoom(Guest guest, ArrayList<SingleRoom> singleRooms) {
        for (int i = 0; i < singleRooms.size(); i++) {
            if(!singleRooms.get(i).isOccupied()){
                singleRooms.get(i).addGuest(guest);
                return;
            }
        }
    }

    public int getRoomGuests() {
        int total = 0;
        for (int i = 0; i < singleRooms.size(); i++) {
            total += singleRooms.get(i).getComplement();
        }
        for (int i = 0; i < doubleRooms.size(); i++) {
            total += doubleRooms.get(i).getComplement();
        }
        for (int i = 0; i < conferenceRooms.size(); i++) {
            total += conferenceRooms.get(i).getComplement();
        }
        return total;
    }


//
//    public Object checkInGuest(Guest guest, String room) {
//
//    }
}
