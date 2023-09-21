public class Baumarkt {

    private String name;

    private double profit;

    Produkt[] products = new Produkt[5];




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

    public Baumarkt(String name, double profit) {
        this.name = name;
        this.profit = profit;

        for(int i = 0; i<5;i++){
            products[i] = new Produkt();
        }

    }

    public void setProducts(){
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



}
