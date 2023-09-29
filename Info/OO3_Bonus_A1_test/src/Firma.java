public class Firma {
    private String name;
    private String address;
    private int room_nr;
    private int max_rooms;

    private Room[] rooms = new Room[10];

    public Room[] getRooms() {
        return rooms;
    }

    public Firma(String name, String address) {
        this.name = name;
        this.address = address;
        this.room_nr = 0;
        this.max_rooms = 10;
    }

    public void addRoom(int room_name, int size, boolean isBooked) {
        if (room_nr <= max_rooms) {
            rooms[room_nr] = new Room(size, room_name, isBooked);
            room_nr++;
        }
        else{
            System.out.println("No more rooms available");
        }
    }

    public int getAmountFreeRooms(){
        return max_rooms - room_nr;
    }


    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public int getRoom_nr() {
        return room_nr;
    }

    public void setRoom_nr(int room_nr) {
        this.room_nr = room_nr;
    }

    public int getMax_rooms() {
        return max_rooms;
    }

    public void setMax_rooms(int max_rooms) {
        this.max_rooms = max_rooms;
    }
}
