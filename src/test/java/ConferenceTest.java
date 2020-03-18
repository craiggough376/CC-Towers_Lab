import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ConferenceTest {

    private ConferenceRoom conferenceRoom1;
    private Guest guest1;

    @Before
    public void before(){
        guest1 = new Guest("Niall");
        conferenceRoom1 = new ConferenceRoom(2, "Small Meeting Room", false);
    }

    @Test
    public void canAddAGuestToConferenceRoom(){
        conferenceRoom1.addGuestToConferenceRoom(guest1);
        assertEquals(1, conferenceRoom1.countGuest());
    }
}
