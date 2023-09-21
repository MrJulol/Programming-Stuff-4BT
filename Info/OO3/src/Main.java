class main {
    public static void main(String[] args) {

        Car a = new Car("yes, ", 2016);
        Car b = new Car("no ,", 2005);
        Car c = new Car(a);
        //System.out.println(a.getBrand() + a.getConstruction_year());
        //System.out.println(b.getBrand() + b.getConstruction_year());

        //System.out.println(a.calcYear());
        System.out.println(Car.getInstanceCounter());
    }
}
