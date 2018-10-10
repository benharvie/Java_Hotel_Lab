import java.util.ArrayList;

public class ConferenceRoom {
    private int roomNumber;
    private int capacity;
    private ArrayList<Guest> roomComplement;

    public ConferenceRoom(int roomNumber){
        this.roomNumber = roomNumber;
        this.capacity = 12;
        this.roomComplement = new ArrayList<>();
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getComplement() {
        return roomComplement.size();
    }
}
