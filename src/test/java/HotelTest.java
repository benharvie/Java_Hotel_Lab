import org.junit.Before;
import org.junit.Test;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

import static org.junit.Assert.assertEquals;

public class HotelTest {
    Guest guest;
    Hotel hotel;
    SingleRoom room1;
    DoubleRoom room2;
    ConferenceRoom room3;

    ArrayList<SingleRoom> singleRooms;
    ArrayList<DoubleRoom> doubleRooms;
    ArrayList<ConferenceRoom> conferenceRooms;

    @Before
    public void before(){
        guest = new Guest();

        room1 = new SingleRoom(1);
        room2 = new DoubleRoom(2);
        room3 = new ConferenceRoom(3, "Cowgate Conference Room");

        singleRooms = new ArrayList<>(Arrays.asList(room1, room1));
        doubleRooms = new ArrayList<>(Arrays.asList(room2, room2, room2));
        conferenceRooms = new ArrayList<>(Arrays.asList(room3));

        hotel = new Hotel("Dump Tower", singleRooms, doubleRooms, conferenceRooms);
    }

    @Test
    public void hasName(){
        assertEquals("Dump Tower", hotel.getName());
    }

    @Test
    public void hasRooms(){
        assertEquals(6, hotel.getRoomCount());
    }

    @Test
    public void checkGuestInSingleRoom(){
        hotel.checkGuestInSingleRoom(guest, singleRooms);
        assertEquals(1, hotel.getRoomGuests());
    }
}
