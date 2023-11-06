public class SPartei extends Partei{



    public SPartei(String name, String beschreibung) {
        this.name = name;
        this.beschreibung = beschreibung;
    }



    public boolean isOkToElect(){
        return calcQuote() > 0.5;
    }

}
