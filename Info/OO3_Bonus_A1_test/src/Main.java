public class Main {
    public static void main(String[] args) {
        Firma a = new Firma("Firma1", "Idk Str");
        Client Client_1 = new Client(1);

        a.addRoom(1, 5, false);


        int found = Client_1.searchRoom(a, 5);
        if (found == -1) {
            System.out.println("Not found");
        } else {
            System.out.println("found");
        }
        //System.out.println(a.getAmountFreeRooms());
    }

}