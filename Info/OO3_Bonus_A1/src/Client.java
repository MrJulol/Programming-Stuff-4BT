public class Client {
    private int client_nr;

    public int getClient_nr() {
        return client_nr;
    }

    public void setClient_nr(int client_nr) {
        this.client_nr = client_nr;
    }

    public Client(int client_nr) {
        this.client_nr = client_nr;
    }

    public int searchRoom(Firma a, int size) {
        Room[] rooms = a.getRooms();
        for (int i = 0; i < a.getRoom_nr(); i++) {
            if (rooms[i].getSize() == size && !rooms[i].getBooked()) {
                return rooms[i].getRoom_nr();
            }
        }
        return -1;
    }
}
