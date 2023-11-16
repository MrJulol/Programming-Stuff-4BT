public class Konto {
    private int guthaben;

    public void einzahlen(int money) {
        assert money > 0 : "not positive money";
        guthaben += money;
    }

    public void abheben(int money) {
        assert money > 0 : "not positive money";
        assert guthaben-money > 0 : "not positive guthaben";
        guthaben-=money;
    }

    public Konto(int guthaben) {
        assert guthaben > 0: "not positive guthaben";
        this.guthaben = guthaben;
    }

    public static void main(String[] args) {
        Konto konto = new Konto(-3);
        konto.einzahlen(-3);
        konto.abheben(-3);
        System.out.println(konto.guthaben);

    }
}
