public class Room {
    public Room(int size, int room_nr, boolean isBooked) {
        this.size = size;
        this.room_nr = room_nr;
        this.booked = isBooked;
    }

    private int size;
    private int room_nr;

    private Boolean booked;


    public int getSize() {
        return size;
    }

    public Boolean getBooked() {
        return booked;
    }

    public int getRoom_nr() {
        return room_nr;
    }

}
