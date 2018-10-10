import org.junit.Before;
import org.junit.Test;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

import static org.junit.Assert.assertEquals;

public class HotelTest {
    Hotel hotel;
    SingleRoom room1;
    DoubleRoom room2;
    ConferenceRoom room3;

    HashMap<String, ArrayList<Object>> roomList;
    ArrayList<Object> singleRooms;
    ArrayList<Object> doubleRooms;
    ArrayList<Object> conferenceRooms;

    @Before
    public void before(){
        room1 = new SingleRoom(1);
        room2 = new DoubleRoom(2);
        room3 = new ConferenceRoom(3, "Cowgate Conference Room");

        singleRooms = new ArrayList<>(Arrays.asList(room1, room1));
        doubleRooms = new ArrayList<>(Arrays.asList(room2, room2, room2));
        conferenceRooms = new ArrayList<>(Arrays.asList(room3));

        roomList = new HashMap<>();
        roomList.put("Single Rooms", singleRooms);
        roomList.put("Double Rooms", doubleRooms);
        roomList.put("Conference Rooms", conferenceRooms);

        hotel = new Hotel("Dump Tower", roomList);
    }

    @Test
    public void hasName(){
        assertEquals("Dump Tower", hotel.getName());
    }

    @Test
    public void hasRooms(){
        assertEquals(6, hotel.getRoomCount());
    }
}
