import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Prints prints = new Prints();
        Scanner input = new Scanner(System.in);

        Baumarkt baumarkt = new Baumarkt();
        Client client = new Client();

        prints.showExpSwitch1();
        int choice = input.nextInt();
        switch (choice) {
            case 1:
                baumarkt.setName("obi");
                baumarkt.setProducts();
                client.setName("seppl");
                client.setMoney(24);
                break;
            case 2:
                System.out.println("Baumarkt Name : " + prints.userInputString());
                baumarkt.setName(input.next());
                System.out.println("Kunde Name and Money: " + prints.userInputString() + prints.userInputInt());
                client.setName(input.next());
                client.setMoney(input.nextInt());
                setProducts(baumarkt, prints, input);
                break;
            default:
                System.exit(0);
        }
        prints.clear();
        System.out.println(prints.buyQuestion());
        int userInBuy = input.nextInt();
        while (userInBuy == 1) {
            prints.BuyMenu(baumarkt.getProducts());
            System.out.println(prints.userInputInt());
            client.kaufe(baumarkt.getProduct(input.nextInt()), baumarkt);

            System.out.println(prints.buyQuestion());
            userInBuy = input.nextInt();
        }
        System.out.println(prints.thankYou());

        prints.printStatistics(client, baumarkt);
    }

    private static void setProducts(Baumarkt baumarkt, Prints myDisplay, Scanner input) {
        for (int i = 0; i < 5; i++) {
            System.out.println(myDisplay.setProductsNameQuestion());
            String name = input.next();
            System.out.println(myDisplay.setProductsPriceQuestion());
            int price = input.nextInt();
            baumarkt.setProductsSingle(name, price, i);
        }
    }


}