import java.util.ArrayList;

public class DoubleRoom {
    private int roomNumber;
    private int capacity;
    private ArrayList<Guest> roomComplement;

    public DoubleRoom(int roomNumber){
        this.roomNumber = roomNumber;
        this.capacity = 2;
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
