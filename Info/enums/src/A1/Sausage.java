package A1;

public class Sausage {
    String name;
    String meatType;
    double cookingTime;

    public Sausage(String name, String meatType, double cookingTime) {
        this.name = name;
        this.meatType = meatType;
        this.cookingTime = cookingTime;
    }

    @Override
    public String toString() {
        return "A1.Sausage{" +
                "name='" + name + '\'' +
                ", meatType='" + meatType + '\'' +
                ", cookingTime=" + cookingTime +
                '}';
    }
}
