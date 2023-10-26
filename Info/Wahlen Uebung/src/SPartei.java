public class SPartei extends Partei{

    private String beschreibung;
    private int NOfKandidaten;

    public SPartei(String name, String beschreibung) {
        this.name = name;
        this.beschreibung = beschreibung;
    }

    public double calcQuote(Partei partei){
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
            System.out.println("_____-----_____-----_____-----_____-----");
        }
    }

    public boolean isOkToElect(){
        return calcQuote(this) > 0.5;
    }

}
