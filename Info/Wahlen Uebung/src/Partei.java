import java.util.ArrayList;

public abstract class Partei {
    protected String name;
    protected ArrayList<Kandidat> kandidaten = new ArrayList<Kandidat>();

    public void addKandidat(Kandidat kandidat){
        this.kandidaten.add(kandidat);
    }
    protected String getName() {
        return name;
    }
}
