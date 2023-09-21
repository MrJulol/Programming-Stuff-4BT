public class Kunde {
    private String name;

    private double money;

    public boolean kaufe(Produkt product, Baumarkt baumarkt) {
        if (this.money < product.getPrice()) {
            System.out.println("Not very Cash Money of you");
            return false;
        } else {
            baumarkt.setProfit(baumarkt.getProfit() + product.getPrice());
            this.money -= product.getPrice();
            System.out.println(this.name + " bought " + product.getName() + " from " + baumarkt.getName());
            System.out.println("Now " + this.name + " has: " + this.money + " money");
            System.out.println();
            System.out.println(baumarkt.getName() + " now made " + baumarkt.getProfit() + " Profit");
        }
        return true;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public Kunde(String name, double money) {
        this.name = name;
        this.money = money;
    }
}
