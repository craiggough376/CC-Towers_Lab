import java.util.ArrayList;

public class Bedroom {

    private int roomNumber;
    private int capacity;
    private ArrayList<Guest> guests;
    private String type;
    private int rate;

    public Bedroom(int roomNumber, int capacity, String type, int rate) {
        this.roomNumber = roomNumber;
        this.capacity = capacity;
        this.type = type;
        this.rate = rate;
        this.guests = new ArrayList<Guest>();
    }

    public int getRate() {
        return rate;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public int getCapacity() {
        return capacity;
    }

    public ArrayList<Guest> getGuests() {
        return guests;
    }

    public String getType() {
        return type;
    }

    public void addGuestToBedroom(Guest guest){
        this.guests.add(guest);
    }

    public int countGuests() {
        return this.guests.size();
    }

    public void removeGuestFromBedroom(Guest guest) {
        this.guests.remove(guest);
    }
}
