import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Prints prints = new Prints();
        Scanner input = new Scanner(System.in);

        Baumarkt baumarkt = new Baumarkt();
        Kunde kunde = new Kunde();

        prints.showExpSwitch1();
        int choice = input.nextInt();
        switch (choice) {
            case 1:
                baumarkt.setName("obi");
                baumarkt.setProducts();
                kunde.setName("seppl");
                kunde.setMoney(24);
                break;
            case 2:
                System.out.println("Baumarkt Name : " + prints.userInputString());
                baumarkt.setName(input.next());
                System.out.println("Kunde Name and Money: " + prints.userInputString() + prints.userInputInt());
                kunde.setName(input.next());
                kunde.setMoney(input.nextInt());
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
            kunde.kaufe(baumarkt.getProduct(input.nextInt()), baumarkt);

            System.out.println(prints.buyQuestion());
            userInBuy = input.nextInt();
        }
        System.out.println(prints.thankYou());

    }

    private static void setProducts(Baumarkt baumarkt, Prints myDisplay, Scanner input) {
        for (int i = 0; i < 5; i++) {
            myDisplay.setProductsNameQuestion();
            String name = input.next();
            myDisplay.setProductsPriceQuestion();
            int price = input.nextInt();
            baumarkt.setProductsSingle(name, price , i);
        }
    }


}