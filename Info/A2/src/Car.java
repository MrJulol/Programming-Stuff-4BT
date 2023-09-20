public class Car {
    String name;
    int Zulassungsjahr;
    int Höchstgeschwindigkeit;
    String Farbe;

    public void setName(String name) {
        this.name = name;
    }

    public void setZulassungsjahr(int zulassungsjahr) {
        Zulassungsjahr = zulassungsjahr;
    }

    public void setHöchstgeschwindigkeit(int höchstgeschwindigkeit) {
        Höchstgeschwindigkeit = höchstgeschwindigkeit;
    }

    public void setFarbe(String farbe) {
        Farbe = farbe;
    }



    public Car(){
        this.name = "default";
        this.Farbe = "default";
        this.Höchstgeschwindigkeit = 0;
        this.Zulassungsjahr = 0;
    }


    public static void main(String[] args) {
        Car a = new Car();
        Car b = new Car();
        Car c = new Car();

        a.setName("Fiat Punto");
        a.setFarbe("Beige");
        a.setHöchstgeschwindigkeit(123);
        a.setZulassungsjahr(2007);

        b.setName("VW Passat");
        b.setFarbe("Schwarz");
        b.setHöchstgeschwindigkeit(190);
        b.setZulassungsjahr(2008);

        c.setName("iVan");
        c.setFarbe("Weiß");
        c.setHöchstgeschwindigkeit(243);
        c.setZulassungsjahr(2005);

        a.fahre(a.Höchstgeschwindigkeit);
        a.gibFarbeAus(a.Farbe);
        a.gibAlterAus(a.Zulassungsjahr);

        b.fahre(b.Höchstgeschwindigkeit);
        b.gibFarbeAus(b.Farbe);
        b.gibAlterAus(b.Zulassungsjahr);

        c.fahre(c.Höchstgeschwindigkeit);
        c.gibFarbeAus(c.Farbe);
        c.gibAlterAus(c.Zulassungsjahr);


    }

    public void fahre(int speed){
        System.out.println( this.name+" fährt: " +speed + "km/h");
    }
    public void gibFarbeAus(String Farbe){System.out.println(this.name + ": Farbe = " + Farbe);
    }
    public void gibAlterAus(int age){
        age = 2023 - age;
        System.out.println(this.name + ": Alter = " + age);
    }
}
