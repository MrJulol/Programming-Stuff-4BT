package A4;

public class Testing implements HasWeight{

    private double weight;
    @Override
    public double getWeight() {
        return this.weight;
    }

    public Testing(double weight) {
        this.weight = weight;
    }
}
