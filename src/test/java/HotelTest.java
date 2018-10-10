import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;

import static org.junit.Assert.assertEquals;

public class HotelTest {
    Hotel hotel;
    SingleRoom room1;
    DoubleRoom room2;
    ConferenceRoom room3;
    HashMap<String, ArrayList<Object>> roomList;

    @Before
    public void before(){
        roomList = new HashMap<>();
        hotel = new Hotel("Dump Tower", roomList);
    }

    @Test
    public void hasName(){
        assertEquals("Dump Tower", hotel.getName());
    }
}
