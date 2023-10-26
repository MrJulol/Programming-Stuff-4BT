import java.util.Objects;

public class Kandidat extends Person implements electable{

    private Partei partei;
    int stimmen = 0;
    public Kandidat(String name, String wohnsitz, int age) {
        super(name, wohnsitz, age);
    }
    public void wählen(){
        if(isElectable()){
            this.stimmen++;
            System.out.println("\t" + this.getName() + " der Partei " + this.getPartei().getName() + " wurde gehählt");
        }else{
            System.out.println("Not electable");
        }
    }
    public void isPartOf(Partei partei){
        this.partei = partei;
    }
    @Override
    public boolean isElectable() {
        return this.getAge() >= 18 && Objects.equals(this.getWohnsitz(), "Südtriol");
    }
    public Partei getPartei() {
        return partei;
    }
    public void printStimmen(){
        System.out.println(this.getName() + " hat " + this.stimmen + " Stimmen erhalten!");
    }
}
