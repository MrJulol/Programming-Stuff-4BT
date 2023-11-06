import java.util.ArrayList;

public abstract class Partei {
    protected String name;
    protected String beschreibung;
    protected int NOfKandidaten;
    protected ArrayList<Kandidat> kandidaten = new ArrayList<Kandidat>();

    public void addKandidat(Kandidat kandidat){
        this.kandidaten.add(kandidat);
        this.calcQuote();
        kandidat.MakePartOfPartei(this);
    }

    public double calcQuote(){
        int men= 0;
        int woman = 0;
        for(Kandidat kandidat: kandidaten){
            if(kandidat.getGender().equals("M")){
                men++;
            } else if(kandidat.getGender().equals("W")){
                woman++;
            }
        }
        return (double) men /(men+woman);
    }
    public void printKandidaten(){
        System.out.println(beschreibung);
        for(Kandidat kandidat: kandidaten){
            System.out.println(kandidat.getName() + " --> " + kandidat.getAge());
            System.out.println(kandidat.getSlogan());
            System.out.println("_____-----_____-----_____-----_____-----");
        }
    }
    protected String getName() {
        return name;
    }
}
