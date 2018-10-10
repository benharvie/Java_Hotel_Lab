import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ConferenceRoomTest {
    ConferenceRoom room3;

    @Before
    public void before(){
        room3 = new ConferenceRoom(3);
    }

    @Test
    public void hasRoomNumber(){
        assertEquals(3, room3.getRoomNumber());
    }

    @Test
    public void hasCapacity(){
        assertEquals(12, room3.getCapacity());
    }

    @Test
    public void hasComplement(){
        assertEquals(0, room3.getComplement());
    }
}
