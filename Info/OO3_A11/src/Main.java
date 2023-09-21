public class Main {
    public static void main(String[] args) {
        Brot bread = new Brot("braun", 3.3);
        bread.print();
        Wein wine = new Wein("rot", 3.3, 15);
        wine.print();

        Brot bread2 = new Brot(wine);
        Wein wine2 = new Wein(bread);

        bread2.print();
        wine2.print();

    }
}