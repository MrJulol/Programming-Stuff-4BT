import java.time.Year;

public class Car {


    private static int instanceCounter = 0;
    private String brand;
    private int construction_year;


    public Car(final String brand, final int construction_year) {
        this.brand = brand;
        this.construction_year = construction_year;
        instanceCounter++;
    }

    public Car(final String brand) {
        this.brand = brand;
        this.construction_year = Year.now().getValue();
        instanceCounter++;
    }

    public Car(final Car c) {
        this.brand = c.brand;
        this.construction_year = c.construction_year;
        instanceCounter++;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        if (brand.isEmpty()) {
            brand = "default";
        } else {
            this.brand = brand;
        }
    }

    public int getConstruction_year() {
        return construction_year;
    }

    public void setConstruction_year(int construction_year) {
        if (construction_year > Year.now().getValue()) {
            this.construction_year = Year.now().getValue();
        } else {
            this.construction_year = construction_year;
        }
    }

    public static int getInstanceCounter() {
        return instanceCounter;
    }

    public int calcYear() {
        return Year.now().getValue() - this.construction_year;
    }

}


