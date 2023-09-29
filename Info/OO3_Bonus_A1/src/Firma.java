public class Firma {
    private String name;
    private String address;
    private int currentRooms;
    private int maxRooms;
    private final Room[] rooms = new Room[10];


    public Firma(String name, String address) {
        this.name = name;
        this.address = address;
        this.maxRooms = 10;
        this.currentRooms = 0;
    }

    public void addRoom(int roomSize) {
        if (currentRooms <= maxRooms) {
            rooms[currentRooms] = new Room(roomSize, currentRooms);
            currentRooms++;
        }
        else{
            System.out.println("Max Rooms reached");
        }
    }

    public int searchRoom(int roomSize) {
        for(int i = 0; i<currentRooms;i++){
            if (rooms[i].getRoomSize() == roomSize && !rooms[i].isBooked()) {
                return rooms[i].getRoomNr();
            }
        }
        return -1;
    }

    public void bookRoom(int freeRoom, int clientNr) {
        this.rooms[freeRoom].setBooked(true);
        this.rooms[freeRoom].setOwnerNr(clientNr);
    }

    public int getFreeRoomNr() {
        int nr = 0;
        for(int i = 0; i<currentRooms;i++){
            if(!rooms[i].isBooked()){
                nr++;
            }
        }

        return nr;
    }
}
