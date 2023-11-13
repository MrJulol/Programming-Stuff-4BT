import java.util.ArrayList;
import java.util.Date;
import java.util.Random;

public class Test {
    public static void main(String[] args) {

        Random rand = new Random();
        ArrayList<Partei> parteien = new ArrayList<Partei>();

        Person person = new Person("Person1", "Südtirol", "M", 39);
        Kandidat k1 = new Kandidat("Kandidat1", "Südtriol", "M", 60, "For the empire!!");
        Kandidat k2 = new Kandidat("Kandidat2", "Südtriol", "M", 60, "For the Republic");
        Kandidat k3 = new Kandidat("Kandidat3", "Südtriol", "M", 60, "YES");
        Kandidat k4 = new Kandidat("Kandidat4", "Südtriol", "M", 60, "NO");
        Kandidat k5 = new Kandidat("Kandidat5", "Südtriol", "M", 60, "Maybe");
        Kandidat k6 = new Kandidat("Kandidat6", "Südtriol", "M", 60, "Promise");
        Kandidat k7 = new Kandidat("Kandidat7", "Südtriol", "M", 60, "await");
        Kandidat k8 = new Kandidat("Kandidat8", "Südtriol", "M", 60, "fork");
        Kandidat k9 = new Kandidat("Kandidat9", "Südtriol", "M", 60, "self");



        Partei partei = new SPartei("SVP", "BAUERNLOBBYISMUS");
        Partei partei1 = new SPartei("PART2", "LETS DO SH1t");
        Partei partei2 = new SPartei("Part3", "We did Sh1t");

        partei.addKandidat(k1);
        partei.addKandidat(k2);
        partei.addKandidat(k3);

        partei1.addKandidat(k4);
        partei1.addKandidat(k5);
        partei1.addKandidat(k6);

        partei2.addKandidat(k7);
        partei2.addKandidat(k8);
        partei2.addKandidat(k9);

        partei.printKandidaten();
        partei1.printKandidaten();
        partei2.printKandidaten();

        parteien.add(partei);
        parteien.add(partei1);
        parteien.add(partei2);

        MyDate currDate = new MyDate(2023, 10, 22);
        MyDate myDate = new MyDate(2023, 10, 22);

        Wahl wahl = new Wahl(myDate, currDate, parteien);

        ArrayList<Person> people = new ArrayList<Person>();
        String makename;
        int randage;
        for (int i = 0; i < 1000; i++) {
            randage = rand.nextInt(100) + 1;
            makename =  "Person" + i;
            people.add(new Person(makename, "Südtriol", "M" , randage));
        }

        for(Person person1: people){
            person1.goElect(k1);
        }



    }
}
