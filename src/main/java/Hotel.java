import java.util.*;

public class Hotel {
    private String name;
    private HashMap<String, ArrayList<Object>> roomList;

    public Hotel(String name, HashMap<String, ArrayList<Object>> roomList) {
        this.name = name;
        this.roomList = roomList;
    }

    public String getName() {
        return name;
    }

    public int getRoomCount() {
        Collection<String> roomTypes = roomList.keySet();

        int total = 0;
        for (int i = 0; i < roomTypes.size() ; i++) {
            String roomType = roomTypes.toArray()[i].toString(); // Converts the collection of keys to an array/string
            total += roomList.get(roomType).size(); // This gets the amount of objects by roomType key
        }

        return total;
    }

    private boolean roomIsFull(ArrayList roomType){
        for (int i = 0; i < roomType.size() ; i++) {
            System.out.println(roomType.get(i));
//            if(roomType == 0){
//
//            }
        }
        return false;
    }

    public Object checkInGuest(Guest guest, String room) {
        Collection<String> roomTypes = roomList.keySet();
        roomIsFull(roomList.get(room));
        // If it does, check if roomComplement.size = 0
        // If true, .add guest to roomComplement (takeInGuest method?)
        return room;
    }
}
