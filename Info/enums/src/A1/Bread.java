package A1;

public class Bread {
    String name;
    String flourType;
    Double weight;

    public Bread(String name, String flourType, Double weight) {
        this.name = name;
        this.flourType = flourType;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "A1.Bread{" +
                "name='" + name + '\'' +
                ", flourType='" + flourType + '\'' +
                ", weight=" + weight +
                '}';
    }
}
