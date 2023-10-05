package A4;

public final class Doppeldecker extends Flugzeug{

    private static final int LOOPINGSPEED = 320;

    private boolean offenesCockpit;

    public Doppeldecker(String hersteller, int maxSpeed, String immatNr, boolean offenesCockpit) {
        super(hersteller, maxSpeed, immatNr, 4);
        this.offenesCockpit = offenesCockpit;
    }

    public Doppeldecker(String hersteller, int maxSpeed, String immatNummer) {
        super(hersteller, maxSpeed, immatNummer, 4);
        this.offenesCockpit = true;
    }

    public boolean isOffenesCockpit() {
        return offenesCockpit;
    }

    public void setOffenesCockpit(boolean offenesCockpit) {
        if(!this.offenesCockpit){
            this.offenesCockpit = true;
        }
    }

    @Override
    public boolean getLooping() {
        return this.getMaxSpeed() >= LOOPINGSPEED;
    }


}
