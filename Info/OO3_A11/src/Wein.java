import java.time.Year;

public class Wein {
    private String farbe;
    private double gewicht;
    private int alter;

    public Wein(String farbe, double gewicht, int alter) {
        this.farbe = farbe;
        this.gewicht = gewicht;
        this.alter = alter;
    }

    public Wein(Brot bread) {
        this.farbe = bread.getFarbe();
        this.gewicht = bread.getGewicht() * 3;
        this.alter = Year.now().getValue();
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

    public int getAlter() {
        return alter;
    }

    public void setAlter(int alter) {
        this.alter = alter;
    }

    public void print() {
        System.out.println("Hello me " + this.farbe + " wine, Me " + this.gewicht + " kg heavy and " + this.alter + " years old");
    }
}
