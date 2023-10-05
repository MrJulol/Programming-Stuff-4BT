package A4;
abstract class Flugzeug {
    private String hersteller ;
    private int maxSpeed;
    private String immatNummer; // Immatrikulationsnummer
    private int anzahlFluegel = 1; // Anzahl Fl ̈ugelpaare

    public Flugzeug(String hersteller, int maxSpeed, String immatNummer, int anzahlFluegel) {
        this.hersteller = hersteller;
        this.maxSpeed = maxSpeed;
        this.immatNummer = immatNummer;
        this.anzahlFluegel = anzahlFluegel;
    }

    public Flugzeug(String hersteller , int maxSpeed, int anzahlFluegel) {
        this . hersteller = hersteller ;
        this .maxSpeed = maxSpeed;
        this .anzahlFluegel = anzahlFluegel;
    }
    public String getImmatNummer(){
        return immatNummer;
    }
    protected void setImmatNummer(String immatNummer){
        this .immatNummer = immatNummer;
    }
    public int getMaxSpeed(){
        return maxSpeed;
    }
    abstract public boolean getLooping(
    );
// weitere Methoden
}