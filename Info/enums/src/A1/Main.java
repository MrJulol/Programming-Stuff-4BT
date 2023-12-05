package A1;

public class Main {
    public static void main(String[] args) {
        Bread br1= new Bread("Weggen", "Weizen", 16.5);
        Sausage sa1 = new Sausage("Meraner", "IDK", 10);
        Pair<Bread, Sausage> hotDog = new Pair<Bread, Sausage>(br1, sa1);
        Bread br2 = hotDog.getFirst(); // gibt br1
        Sausage sa2 = hotDog.getSecond(); // gibt sa1

        System.out.println(br2.toString());
        System.out.println(sa2.toString());

        Pair<Sausage, Bread> hot2 = hotDog.flip();
        Sausage sa3 = hot2.getFirst(); // gibt br1
        Bread br3 = hot2.getSecond(); // gibt sa1
        System.out.println(br3.toString());
        System.out.println(sa3.toString());
    }

}
