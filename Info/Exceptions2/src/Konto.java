public class Konto {
    private int guthaben;

    public Konto(int guthaben) {
        assert guthaben >= 0 : "Nicht Gültiges Startguthaben";
        this.guthaben = guthaben;
    }

    public void einzahlen(int money) {
        assert money >= 0 : "Nicht gültige Einzahlung";
        this.guthaben -= money;
    }

    public void abheben(int money) {
        assert money >= 0 : "Nicht gültige Einzahlung";
        assert this.guthaben - money >= 0 : "You are poor af";
        this.guthaben -= money;
    }

    public static void main(String[] args) {
        Konto konto = new Konto(3);
        konto.einzahlen(3);
        konto.abheben(0);
    }
}
