public class Car_OO3 {

    public Car_OO3(String brand, int constru_year) {
        this.brand = brand;
        this.constru_year = constru_year;
    }

    public String getMarke() {
        return brand;
    }

    public void setMarke(String marke) {
        brand = marke;
    }
    public int getConstru_year() {
        return constru_year;
    }

    public void setConstru_year(int constru_year) {
        this.constru_year = constru_year;
    }

    String brand;
    int constru_year;

}

class main {
    public static void main(String[] args) {

        Car a = new Car();


    }
}
