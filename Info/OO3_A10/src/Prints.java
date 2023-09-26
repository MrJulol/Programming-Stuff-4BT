public class Prints {

    public String thankYou(){
        return "Thank you for Buying!";
    }

    public String buyQuestion() {
        return "Do you want to buy? 1 = yes, 0 = no";
    }

    public void showExpSwitch1() {
        System.out.println("Select mode to set values to everything");
        System.out.println("\t|1| = Set to default values");
        System.out.println("\t|2| = Set to custom values");
        System.out.println("\trest = stop");

    }

    public String userInputInt() {
        return "Enter a number (int) ";
    }

    public String userInputString() {
        return "Enter a Word (String) ";
    }

    public void setProductsNameQuestion() {
        System.out.println("Enter the name of a product");
    }

    public void setProductsPriceQuestion() {
        System.out.println("Enter the price of a product");
    }

    public void BuyMenu(Produkt[] products) {
        for (int i = 0; i < 5; i++) {
            System.out.println("Product " + i + ": name = " + products[i].getName() + " ||Price = " + products[i].getPrice());
        }
    }

    public void clear() {
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
    }
}
