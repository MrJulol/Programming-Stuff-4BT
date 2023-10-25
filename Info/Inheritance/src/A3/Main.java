package A3;

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog(13,3,"Husky");
        dog.makeSound();

        Mammal mammal = new Mammal(180, 17);
        mammal.makeSound();

        Cat cat = new Cat(2, 16);
        cat.makeSound();

        PolarBear polarBear = new PolarBear(240, 5, "white");
        polarBear.makeSound();
    }
}
