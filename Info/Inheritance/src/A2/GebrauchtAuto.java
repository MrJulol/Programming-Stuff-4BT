package A2;

public class GebrauchtAuto extends Auto{
    int kilometer;

    public GebrauchtAuto(double neuwagenpreis, int baujahr, String modell, int kilometer) {
        super(neuwagenpreis, baujahr, modell);
        init(kilometer);
    }

    private void init(int kilometer) {
        this.kilometer = kilometer;
    }
    @Override
    public double getPreis(){
        int km = this.kilometer;
        double price = this.neuwagenpreis;
        while(km > 20000){
            price = price *0.9;
            km-=20000;
            if(price < 2000) {
                return price / 0.9;
            }
        }
        return price;
    }
}
