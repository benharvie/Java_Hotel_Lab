import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SingleRoomTest {
    SingleRoom room1;

    @Before
    public void before(){
        room1 = new SingleRoom(1);
    }

    @Test
    public void hasRoomNumber(){
        assertEquals(1, room1.getRoomNumber());
    }
}
