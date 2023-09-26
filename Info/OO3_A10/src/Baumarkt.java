public class Baumarkt {

    private String name;

    private double profit;

    private final Produkt[] products = new Produkt[5];

    public Produkt[] getProducts() {
        return products;
    }

    public Produkt getProduct(int i) {
        return products[i];
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getProfit() {
        return profit;
    }

    public void setProfit(double profit) {
        this.profit = profit;
    }

    public Baumarkt() {
        this.profit = 0;

        for (int i = 0; i < 5; i++) {
            products[i] = new Produkt();
        }
    }

    public void setProducts() {
        this.products[0].setName("Prod1");
        this.products[1].setName("Prod2");
        this.products[2].setName("Prod3");
        this.products[3].setName("Prod4");
        this.products[4].setName("Prod5");

        this.products[0].setPrice(1.1);
        this.products[1].setPrice(2.2);
        this.products[2].setPrice(3.3);
        this.products[3].setPrice(4.4);
        this.products[4].setPrice(5.5);
    }
    public void setProductsSingle(String name, int price, int i){
        this.products[i].setName(name);
        this.products[i].setPrice(price);


    }


}
