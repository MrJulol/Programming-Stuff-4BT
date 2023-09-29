public class Main {
    public static void main(String[] args) {
        Client client = new Client(1);
        Firma firma = new Firma("Eine Firma", "idk Strasse 69");

        firma.addRoom(4);
        firma.addRoom(2);


        System.out.println("Number of free rooms: " + firma.getFreeRoomNr());

        int freeRoom = firma.searchRoom(4);

        if (freeRoom == -1) {
            System.out.println("No room available");
        } else {
            firma.bookRoom(freeRoom, client.getClientNr());
        }

        System.out.println("Number of free rooms: " + firma.getFreeRoomNr());

    }
}
