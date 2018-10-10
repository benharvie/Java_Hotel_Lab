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
        Collection<String> roomCount = roomList.keySet();

        int total = 0;
        for (int i = 0; i < roomCount.size() ; i++) {
            String roomType = roomCount.toArray()[i].toString(); // Converts the collection of keys to an array/string
            total += roomList.get(roomType).size(); // This gets the amount of objects by roomType key
        }

        return total;
    }
}
