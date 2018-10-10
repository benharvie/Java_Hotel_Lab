import java.util.ArrayList;

public class ConferenceRoom {
    private int roomNumber;
    private int capacity;
    private String name;
    private ArrayList<Guest> roomComplement;

    public ConferenceRoom(int roomNumber, String name){
        this.roomNumber = roomNumber;
        this.capacity = 12;
        this.name = name;
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

    public String getName() {
        return name;
    }
}
