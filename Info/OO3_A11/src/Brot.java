public class Brot {
    private String farbe;
    private double gewicht;

    public Brot(final String farbe, final double gewicht) {
        this.farbe = farbe;
        this.gewicht = gewicht;
    }
    public Brot(final Wein wine) {{{{{
        this.farbe = wine.getFarbe();
        this.gewicht = getGewicht() * 3;
    }

    public String getFarbe() {
        return farbe;
    }

    public void setFarbe(String farbe) {
        this.farbe = farbe;
    }

    public double getGewicht() {
        return gewicht;
    }

    public void setGewicht(double gewicht) {
        this.gewicht = gewicht;
    }

    public void print() {
        System.out.println("Hello me " + this.farbe + " bread, Me " + this.gewicht + " kg heavy");
    }
}
