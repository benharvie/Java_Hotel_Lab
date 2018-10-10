import java.util.ArrayList;

public class SingleRoom {
    private int roomNumber;
    private int capacity;
    private ArrayList<Guest> roomComplement;

    public SingleRoom(int roomNumber){
        this.roomNumber = roomNumber;
        this.capacity = 1;
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

    public boolean isOccupied(){
        if(roomComplement.size() > 0) {
            return true;
        } else {
            return false;
        }
    }

    public void addGuest(Guest guest){
        this.roomComplement.add(guest);
    }
}
