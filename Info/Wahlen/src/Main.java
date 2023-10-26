public class Main {
    public static void main(String[] args) {
        SPartei svp = new SPartei("SVP", 32);
        SPartei freiheit = new SPartei("Südtiroler Freiheit", 17);

        Kandidat k1 = new Kandidat("Philip Achhammer", "Südtriol", 48);
        k1.isPartOf(svp);

        Kandidat k2 = new Kandidat("Sven Knoll", "Südtriol", 36);
        k2.isPartOf(freiheit);

        Person p1 = new Person("iVan", "Südtriol", 18);
        p1.gehWählen(k2);

        Person p2 = new Person("Aleg", "!Südtirol", 17);
        p2.gehWählen(k1);

        k1.gehWählen(k1);

        System.out.println();
        k1.printStimmen();
        k2.printStimmen();
    }
}