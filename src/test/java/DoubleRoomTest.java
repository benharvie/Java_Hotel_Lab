import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DoubleRoomTest {
    DoubleRoom room2;

    @Before
    public void before(){
        room2 = new DoubleRoom(2);
    }

    @Test
    public void hasRoomNumber(){
        assertEquals(2, room2.getRoomNumber());
    }

    @Test
    public void hasCapacity(){
        assertEquals(2, room2.getCapacity());
    }

    @Test
    public void hasComplement(){
        assertEquals(0, room2.getComplement());
    }
}
