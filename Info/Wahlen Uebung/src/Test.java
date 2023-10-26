public class Test {
    public static void main(String[] args) {
        Person person = new Person("Person1", "Südtirol", "M", 39);
        Kandidat k1 = new Kandidat("Kandidat1", "Südtriol", "M", 60);

        Partei partei = new SPartei("SVP", "BAUERNLOBBYISMUS");

        partei.addKandidat(k1);
    }
}
