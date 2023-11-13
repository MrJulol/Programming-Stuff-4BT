import java.util.Objects;

public class Kandidat extends Person implements electable{

    private int NOfVotes;
    private Partei isPartOf;
    private String slogan;

    public void MakePartOfPartei(Partei partei){
        this.isPartOf = partei;
    }

    public void elect(){
        if(isElectable() && this.isPartOf.calcQuote() >= 1/3){
            this.NOfVotes++;
            System.out.println(this.getName() + " wurde gewählt!");
        } else {
            System.out.println(this.getName() + " konnte nicht gehählt werden");
        }
    }

    @Override
    public boolean isElectable() {
        return this.getAge() >= 18 && Objects.equals(this.getWohnort(), "Südtriol");

    }

    public Kandidat(String name, String wohnort, String gender, int age, String slogan) {
        super(name, wohnort, gender, age);
        this.slogan = slogan;
    }

    public String getSlogan() {
        return slogan;
    }
}
