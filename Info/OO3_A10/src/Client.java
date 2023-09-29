public class Client {
    private String name;

    private double money;

    public void kaufe(Produkt product, Baumarkt baumarkt) {
        if (this.money < product.getPrice()) {
            System.out.println("Not very Cash Money of you");
        } else {
            baumarkt.setProfit(baumarkt.getProfit() + product.getPrice());
            this.money -= product.getPrice();
            System.out.println(this.name + " bought " + product.getName() + " from " + baumarkt.getName());
            System.out.println("Now " + this.name + " has: " + this.money + " money");
            System.out.println();
            System.out.println(baumarkt.getName() + " now made " + baumarkt.getProfit() + " Profit\n");
        }
    }


    public void setName(String name) {
        this.name = name;
    }


    public void setMoney(double money) {
        this.money = money;
    }


    public String getName() {
        return name;
    }

    public double getMoney() {
        return money;
    }
}
