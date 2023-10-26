import java.util.Objects;

public class Person implements electable{
    private final String name;
    private final String wohnsitz;
    private final int age;

    public String getName() {
        return name;
    }

    public String getWohnsitz() {
        return wohnsitz;
    }

    public int getAge() {
        return age;
    }


    public Person(String name, String wohnsitz, int age) {
        this.name = name;
        this.wohnsitz = wohnsitz;
        this.age = age;
    }

    public void gehWählen(Kandidat kandidat){
        if(isElectable()){
            System.out.println(this.name + " geht Wählen: ");
            kandidat.wählen();
        } else {
            System.out.println(this.getName() + " kann nicht wählen!");
        }
    }


    @Override
    public boolean isElectable() {
        return this.getAge() >= 18 && Objects.equals(this.getWohnsitz(), "Südtriol");
    }
}
