import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HotelTest {

    private Bedroom bedroom1;
    private Bedroom bedroom2;
    private Hotel hotel;
    private ConferenceRoom conferenceRoom1;
    private ConferenceRoom conferenceRoom2;
    private Guest guest1;
    private Guest guest2;

    @Before
    public void before(){
        hotel = new Hotel("Overlook Hotel");
        bedroom1 = new Bedroom(237, 2, "Double", 10);
        bedroom2 = new Bedroom(100, 1, "Single", 20);
        conferenceRoom1 = new ConferenceRoom(2, "Ballroom", true);
        conferenceRoom2 = new ConferenceRoom(3, "Living Room", false);
        guest1 = new Guest("Craig");
        guest2 = new Guest("Niall");

        hotel.addBedroom(bedroom1);
        hotel.addBedroom(bedroom2);
        hotel.addConferenceRoom(conferenceRoom1);
        hotel.addConferenceRoom(conferenceRoom2);

    }

    @Test
    public void canCheckGuestIntoBedroom(){
        hotel.checkInGuest(guest1, bedroom1);
        assertEquals(1, bedroom1.countGuests());
    }

    @Test
    public void canCheckGuestOutOfRoom(){
        hotel.checkInGuest(guest1, bedroom1);
        bedroom1.removeGuestFromBedroom(guest1);
        assertEquals(0, bedroom1.countGuests());
    }

    @Test
    public void getBooking(){
        Booking booking = hotel.getBooking(bedroom1, 3);
        assertEquals(3, booking.getNightsBooked());
    }

    @Test
    public void getBill(){
        Booking booking = hotel.getBooking(bedroom1, 3);
        assertEquals(30, booking.getBill());
    }

}
