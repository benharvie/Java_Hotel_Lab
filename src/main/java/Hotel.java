import java.util.ArrayList;
import java.util.HashMap;

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
}
