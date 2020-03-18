import java.util.ArrayList;

public class Hotel {

    private String name;
    private ArrayList<ConferenceRoom> conferenceRooms;
    private ArrayList<Bedroom> bedrooms;

    public Hotel(String name) {
        this.conferenceRooms = new ArrayList<ConferenceRoom>();
        this.bedrooms = new ArrayList<Bedroom>();
        this.name = name;
    }

    public void addConferenceRoom(ConferenceRoom conferenceRoom){
        this.conferenceRooms.add(conferenceRoom);
    }

    public void addBedroom(Bedroom bedroom){
        this.bedrooms.add(bedroom);
    }

    public int countBedrooms(){
        return this.bedrooms.size();
    }

    public String getName() {
        return name;
    }


    public void checkInGuest(Guest guest, Bedroom bedroom) {
        if(this.bedrooms.contains(bedroom) && (bedroom.getCapacity() > bedroom.countGuests())){
            bedroom.addGuestToBedroom(guest);
        }
    }

    public void checkOutGuest(Guest guest, Bedroom bedroom){
        bedroom.removeGuestFromBedroom(guest);
    }

    public Booking getBooking(Bedroom bedroom, int nights){
        return new Booking(bedroom, nights);
    }
}
