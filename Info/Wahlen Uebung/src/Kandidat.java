import java.util.Objects;

public class Kandidat extends Person implements electable{

    private int NOfVotes;
    private Partei isPartOf;

    public void MakePartOfPartei(Partei partei){
        this.isPartOf = partei;
        partei.addKandidat(this);
    }
    @Override
    public boolean isElectable() {
        return this.getAge() >= 18 && Objects.equals(this.getWohnort(), "Südtriol");

    }

    public Kandidat(String name, String wohnort, String gender, int age) {
        super(name, wohnort, gender, age);
    }
}
