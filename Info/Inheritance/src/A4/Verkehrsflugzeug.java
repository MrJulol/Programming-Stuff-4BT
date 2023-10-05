package A4;

public class Verkehrsflugzeug extends Flugzeug{

    int anzahlPassagiere;

    public int getAnzahlPassagiere() {
        return anzahlPassagiere;
    }

    public void setAnzahlPassagiere(int anzahlPassagiere) {
        this.anzahlPassagiere = anzahlPassagiere;
    }

    public Verkehrsflugzeug(String hersteller, int maxSpeed, String immatNr, int Passagiere) {
        super(hersteller, maxSpeed, immatNr, 2);
        init(Passagiere);
    }

    private void init(int passagiere) {
        this.anzahlPassagiere = passagiere;
    }

    @Override
     final public boolean getLooping() {
        return false;
    }
}
