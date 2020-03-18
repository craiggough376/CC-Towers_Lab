import java.util.ArrayList;

public class ConferenceRoom {

    private int capacity;
    private ArrayList<Guest> guests;
    private String name;
    private boolean servesBooze;

    public ConferenceRoom(int capacity, String name, boolean servesBooze) {
        this.capacity = capacity;
        this.name = name;
        this.servesBooze = servesBooze;
        this.guests = new ArrayList<Guest>();
    }

    public int getCapacity() {
        return capacity;
    }

    public ArrayList<Guest> getGuests() {
        return guests;
    }

    public String getName() {
        return name;
    }

    public boolean isServesBooze() {
        return servesBooze;
    }

    public void addGuestToConferenceRoom(Guest guest){
        this.guests.add(guest);
    }

    public int countGuest() {
        return this.guests.size();
    }
}
