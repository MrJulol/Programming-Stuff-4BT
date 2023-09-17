public class Car {
    String name;
    int Zulassungsjahr;
    int Höchstgeschwindigkeit;
    String Farbe;


    public static void main(String[] args) {
        Car a = new Car();
        Car b = new Car();
        Car c = new Car();

        a.name = "Fiat";
        a.Farbe = "rot";
        a.Zulassungsjahr = 2006;
        a.Höchstgeschwindigkeit = 112;

        b.name = "VW";
        b.Farbe = "grau";
        b.Zulassungsjahr = 2012;
        b.Höchstgeschwindigkeit = 160;

        c.name = "iVan";
        c.Farbe = "Weiß";
        c.Zulassungsjahr = 2005;
        c.Höchstgeschwindigkeit = 600;

        fahre(a.Höchstgeschwindigkeit);
        gibAlterAus(a.Zulassungsjahr);
        gibFarbeAus(a.Farbe);
    }

    public static void fahre(int speed){
        System.out.println("Auto fährt: " +speed + "km/h");
    }
    public static void gibFarbeAus(String Farbe){
    }
    public static void gibAlterAus(int age){}
}
