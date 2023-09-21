public class Main {
    public static void main(String[] args) {
        Kunde a = new Kunde("John", 36.6);
        Baumarkt obi = new Baumarkt("obi", 0);
        Baumarkt notObi = new Baumarkt("notObi", 0);

        obi.setProducts();
        notObi.setProducts();

        while(a.kaufe(obi.products[0], obi)){

        }
        System.out.println("no money, Bye life");

    }


}