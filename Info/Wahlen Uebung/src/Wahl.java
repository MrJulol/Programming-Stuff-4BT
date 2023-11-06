import java.util.ArrayList;
import java.util.Date;

public class Wahl {
    private MyDate myDate;
    private MyDate currDate;
    ArrayList<Partei> parteien;

    public Wahl(MyDate myDate, MyDate currDate, ArrayList<Partei> parteien) {
        this.myDate = myDate;
        this.currDate = currDate;
        this.parteien = parteien;
    }
}
