import java.util.ArrayList;
import java.util.Date;

public class Test {
    public static void main(String[] args) {

        ArrayList<Partei> parteien = new ArrayList<Partei>();

        Person person = new Person("Person1", "Südtirol", "M", 39);
        Kandidat k1 = new Kandidat("Kandidat1", "Südtriol", "M", 60, "For the empire!!");
        Kandidat k2 = new Kandidat("Kandidat2", "Südtriol", "M", 60, "For the Republic");

        Partei partei = new SPartei("SVP", "BAUERNLOBBYISMUS");

        partei.addKandidat(k1);
        partei.addKandidat(k2);

        partei.printKandidaten();

        parteien.add(partei);

        MyDate currDate = new MyDate(2023, 10, 22);
        MyDate myDate = new MyDate(2023, 10, 22);

        Wahl wahl = new Wahl(myDate, currDate, parteien);

        ArrayList<Person> people = new ArrayList<Person>();
        String makename;
        for (int i = 0; i < 100; i++) {
            makename =  "Person" + i;
            people.add(new Person(makename, "Südtriol", "M" , 63));
        }

    }
}
