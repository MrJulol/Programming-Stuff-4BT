package A3;

public class PolarBear extends Mammal{
    private String color;

    public PolarBear(int size, int age, String color) {
        super(age, size);
        init(color);
    }

    private void init(String color) {
        this.color = color;
    }
}
