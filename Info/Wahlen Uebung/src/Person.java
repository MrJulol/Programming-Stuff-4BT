import java.util.Objects;

public class Person implements electable {

    private String name;
    private String wohnort;
    private String gender;
    private int age;

    public Person(String name, String wohnort, String gender, int age) {
        this.name = name;
        this.wohnort = wohnort;
        this.gender = gender;
        this.age = age;
    }

    public void goElect(Kandidat kandidat) {
        if(isElectable()){
            kandidat.
        }
    }

    public String getWohnort() {
        return wohnort;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean isElectable() {
        return this.getAge() >= 18 && Objects.equals(this.getWohnort(), "Südtriol");
    }
}