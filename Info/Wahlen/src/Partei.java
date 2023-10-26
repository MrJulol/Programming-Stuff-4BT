public abstract class Partei {
    private final String name;
    private final double quote;

    public Partei(String name, double quote) {
        this.name = name;
        this.quote = quote;
    }

    public String getName() {
        return name;
    }
}
