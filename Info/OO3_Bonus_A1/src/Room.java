public class Room {
    private int roomSize;
    private int roomNr;

    private int ownerNr;

    public int getRoomNr() {
        return roomNr;
    }

    public void setOwnerNr(int ownerNr) {
        this.ownerNr = ownerNr;
    }

    public void setBooked(boolean booked) {
        isBooked = booked;
    }

    private boolean isBooked;

    public int getRoomSize() {
        return roomSize;
    }

    public boolean isBooked() {
        return isBooked;
    }

    public Room(int roomSize, int roomNr) {
        this.roomSize = roomSize;
        this.roomNr = roomNr;
        this.ownerNr = -1;
        this.isBooked = false;
    }


}
