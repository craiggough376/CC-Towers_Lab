import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BedroomTest {

    private Bedroom bedroom1;
    private Guest guest1;

    @Before
    public void before(){
        bedroom1 = new Bedroom(237, 2, "Double", 10);
        guest1 = new Guest("Jack");
    }

    @Test
    public void canAddGuestToBedroom(){
        bedroom1.addGuestToBedroom(guest1);
        assertEquals(1, bedroom1.countGuests());
    }

}
