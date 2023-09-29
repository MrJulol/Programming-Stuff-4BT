public class Room {
    public Room(int size, int room_nr, boolean isBooked) {
        this.size = size;
        this.room_nr = room_nr;
        this.booked = isBooked;
    }

    private int size;
    private int room_nr;

    private Boolean booked;

    private int booked_by;

    public int getBooked_by() {
        return booked_by;
    }

    public void setBooked_by(int booked_by) {
        this.booked_by = booked_by;
    }

    public int getSize() {
        return size;
    }

    public Boolean getBooked() {
        return booked;
    }

    public void setBooked(Boolean booked) {
        this.booked = booked;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getRoom_nr() {
        return room_nr;
    }

    public void setRoom_nr(int room_nr) {
        this.room_nr = room_nr;
    }
}
