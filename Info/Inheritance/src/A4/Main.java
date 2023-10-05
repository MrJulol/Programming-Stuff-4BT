package A4;

public class Main {
    public static void main(String[] args) {
        Flugzeug flugzeug = new Flugzeug("hersteller flugzeug", 320, "immatNr flugzeug", 2) {
            @Override
            public boolean getLooping() {
                return false;
            }
        };
        System.out.println(flugzeug.getMaxSpeed());
        Verkehrsflugzeug verkehrsflugzeug = new Verkehrsflugzeug("Hersteller verkehrs", 420, "immag Verkehrs", 10);
        System.out.println(verkehrsflugzeug.getLooping());

        Doppeldecker doppeldecker = new Doppeldecker("hersteller doppel", 320, "immat doppel", false);
        System.out.println(doppeldecker.getLooping());
        System.out.println(doppeldecker.isOffenesCockpit());
        doppeldecker.setOffenesCockpit(true);
        System.out.println(doppeldecker.isOffenesCockpit());
        doppeldecker.setOffenesCockpit(false);
        System.out.println(doppeldecker.isOffenesCockpit());
    }
}
